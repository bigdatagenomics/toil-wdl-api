package org.bdgenomics.api;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import javax.ws.rs.BadRequestException;
import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;
import org.bdgenomics.cwl.CWLObjectMapper;
import org.bdgenomics.cwl.CWLPackage;
import org.bdgenomics.cwl.Workflow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandLineWorkflowService implements WorkflowService {

  public static final Logger LOG = LoggerFactory.getLogger(CommandLineWorkflowService.class);

  public static int NEXT_ID = 0;

  private static Map<String, SubmittedWorkflow> runningProcesses = new TreeMap<>();

  @Override
  public String create(CWLPackage components, Map<String, Object> inputs) throws IOException {

    String id = String.valueOf(NEXT_ID++);
    LOG.info(String.format("Workflow UUID: %s", id));

    String tempDirFilename = System.getProperty("java.io.tmpdir");
    File tmp = new File(tempDirFilename);

    File basedir = new File(tmp, "toil-" + id);
    basedir.mkdir();

    File outputdir = new File(basedir, "output");
    outputdir.mkdir();

    LOG.info(String.format("Base dir: %s", basedir.getAbsolutePath()));
    File logFile = new File(basedir, "log-" + id + ".txt");

    ObjectMapper jsonMapper = new ObjectMapper();
    CWLObjectMapper mapper = new CWLObjectMapper();

    File workflowFile = new File(basedir, "workflow-" + id + ".cwl");
    mapper.writeValue(workflowFile, components.workflow);

    File inputFile = new File(basedir, "inputs-" + id + ".yml");
    mapper.writeValue(inputFile, inputs);

    for(String toolName : components.tools.keySet()) {
      File toolFile = new File(basedir, toolName);
      mapper.writeValue(toolFile, components.tools.get(toolName));
    }

    ProcessBuilder pb = new ProcessBuilder("cwltoil",
      "--basedir", basedir.getAbsolutePath(),
      "--outdir", outputdir.getAbsolutePath(),
      "--logFile",  logFile.getAbsolutePath(),
      workflowFile.getAbsolutePath(),
      inputFile.getAbsolutePath());

    try {
      Process p = pb.start();
      runningProcesses.put(id, new SubmittedWorkflow(id, p));

      return id;

    } catch (IOException e) {
      e.printStackTrace(System.err);
      return null;
    }
  }

  @Override
  public String abort(String workflowId) {
    SubmittedWorkflow workflow = runningProcesses.get(workflowId);
    workflow.abort();
    return "aborted";
  }

  @Override
  public String status(String workflowId) {
    if(!runningProcesses.containsKey(workflowId)) {
      throw new BadRequestException(String.format("Unknown workflowId %s (available IDs %s)",
        workflowId, runningProcesses.keySet()));
    }
    return runningProcesses.get(workflowId).isRunning() ? "running" : "finished";
  }

  @Override
  public String metadata(String workflowId) {
    return "";
  }

  @Override
  public Map<String, Object> outputs(String workflowId) {
    Map<String, Object> outputMap = new LinkedHashMap<>();
    SubmittedWorkflow workflow = runningProcesses.get(workflowId);
    if(!workflow.isRunning()) {
      workflow.waitForProcess();
      if(workflow.parsedResult != null) {
        outputMap.putAll(workflow.parsedResult);
      } else {
        outputMap.put("error_message", workflow.rawResult);
      }
    }
    return outputMap;
  }

  @Override
  public Logs logs(String workflowId) {
    return new Logs();
  }
}

class SubmittedWorkflow {

  public static Logger LOG = LoggerFactory.getLogger(SubmittedWorkflow.class);

  public final String workflowID;
  public Process process;

  public String rawResult;
  public Map<String, Object> parsedResult;
  public String resultPath;

  public SubmittedWorkflow(String workflowId, Process p) {
    this.workflowID = workflowId;
    this.process = p;
  }

  public boolean isRunning() {
    try {
      int exit = process.exitValue();
      return false;

    } catch(IllegalThreadStateException e) {
      return true;
    }
  }

  public void waitForProcess() {
    try {
      process.waitFor();

      ObjectMapper jsonMapper = new ObjectMapper();

      try(InputStream is = process.getInputStream()) {
        Reader r = new InputStreamReader(is, "UTF-8");
        rawResult = readCompletely(r);
        parsedResult = jsonMapper.readValue(rawResult, Map.class);
        Map<String, Object> output = (Map<String, Object>)parsedResult.get("output");
        resultPath = (String)output.get("path");

      } catch (IOException e) {
        LOG.warn(
          String.format("Couldn't retrieve response for workflow %s, raw result \"%s\"", workflowID, rawResult),
          e);
      }

    } catch (InterruptedException e) {
      LOG.warn("Process wait interrupted", e);
    }
  }

  public void abort() {
    if(isRunning()) {
      process.destroy();
    }
  }

  private String readCompletely(Reader r) throws IOException {
    char[] buffer = new char[1024];
    int length = -1;
    StringBuilder sb = new StringBuilder();
    while((length = r.read(buffer)) != -1) {
      sb.append(buffer, 0, length);
    }

    return sb.toString();
  }
}
