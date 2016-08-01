package org.bdgenomics.resources;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.cwl.CWLObjectMapper;
import org.bdgenomics.cwl.CWLPackage;
import org.bdgenomics.cwl.CommandLineTool;
import org.bdgenomics.cwl.WDLTranspiler;
import org.bdgenomics.cwl.Workflow;
import org.bdgenomics.wdl.evaluation.WDLDocument;
import org.bdgenomics.wdl.evaluation.WDLEvaluator;
import org.bdgenomics.wdl.evaluation.WDLTask;
import org.bdgenomics.wdl.evaluation.WDLWorkflow;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Path("/api/workflows/v1")
public class WorkflowsResource {

  public static final Logger LOG = LoggerFactory.getLogger(WorkflowsResource.class);

  private ToilService service;

  public WorkflowsResource(ToilService service) {
    this.service = service;
  }

  /*
  @POST
  @Consumes("text/plain")
  public Response convert(String wdlSource) {

    try {
      WDLDocument wdl = WDLEvaluator.parse(new WDLDocument.Builder(), wdlSource);

      CWLPackage cwl = new WDLTranspiler().convertDocument(wdl);

      CWLObjectMapper mapper = new CWLObjectMapper();

      String response = mapper.writeValueAsString(cwl);

      return Response.accepted().entity(response).build();

    } catch (IOException e) {

      throw new BadRequestException(String.format("Couldn't parse wdl document\n%s", wdlSource), e);
    }
  }
  */

  @POST
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  @Produces("text/plain")
  public Response create(@FormDataParam("wdlSource") String wdlSource,
                         @FormDataParam("workflowInputs") String workflowInputs,
                         @FormDataParam("workflowOptions") String workflowOptions) {

    try {
      LOG.info("wdlSource: {}", wdlSource);

      WDLDocument wdlDocument = WDLEvaluator.parse(new WDLDocument.Builder(), wdlSource);

      CWLPackage cwlDocument = new WDLTranspiler().convertDocument(wdlDocument, true);

      ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

      Map<String, Object> inputs = mapper.readValue(workflowInputs, Map.class);

      String response = service.workflowService().create(cwlDocument, inputs);

      return Response.accepted().entity(response).build();

    } catch (IOException e) {

      LOG.error("Couldn't parse wdlSource", e);
      throw new BadRequestException("Couldn't parse wdlSource", e);
    }
  }
}
