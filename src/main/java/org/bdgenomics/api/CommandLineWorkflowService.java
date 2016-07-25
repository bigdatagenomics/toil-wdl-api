package org.bdgenomics.api;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;
import org.bdgenomics.cwl.CWLObjectMapper;
import org.bdgenomics.cwl.Workflow;

public class CommandLineWorkflowService implements WorkflowService {

  private Map<String, Process> runningProcesses = new TreeMap<>();

  @Override
  public String create(Workflow workflow, Map<String, Object> inputs) throws IOException {

    String uuid = UUID.randomUUID().toString();
    File workflowFile = File.createTempFile("workflow-" + uuid + "-", ".cwl");
    File tempDir = workflowFile.getParentFile();
    File logFile = new File(tempDir, "log-" + uuid + ".txt");
    File inputFile = new File(tempDir, "inputs-" + uuid + ".yml");

    CWLObjectMapper mapper = new CWLObjectMapper();
    mapper.writeValue(workflowFile, workflow);
    mapper.writeValue(inputFile, inputs);

    ProcessBuilder pb = new ProcessBuilder("cwltoil",
      "--logFile",  logFile.getAbsolutePath(),
      workflowFile.getAbsolutePath(),
      inputFile.getAbsolutePath());

    try {
      Process p = pb.start();
      runningProcesses.put(uuid, p);

      return uuid;

    } catch (IOException e) {
      e.printStackTrace(System.err);
      return null;
    }
  }

  @Override
  public String abort(String workflowId) {
    Process p = runningProcesses.get(workflowId);
    p.destroy();
    return "aborted";
  }

  @Override
  public String status(String workflowId) {
    return null;
  }

  @Override
  public String metadata(String workflowId) {
    return null;
  }

  @Override
  public Map<String, Object> outputs(String workflowId) {
    return null;
  }

  @Override
  public Logs logs(String workflowId) {
    return null;
  }
}
