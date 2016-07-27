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

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/api/workflows/v1")
@Produces(MediaType.APPLICATION_JSON)
public class WorkflowsResource {

  private ToilService service;

  public WorkflowsResource(ToilService service) {
    this.service = service;
  }

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

  @POST
  @Consumes("multipart/form-data")
  public Response create(@FormParam("wdlSource") String wdlSource,
                         @FormParam("workflowInputs") String workflowInputs,
                         @FormParam("workflowOptions") String workflowOptions) {

    try {
      WDLDocument wdlDocument = WDLEvaluator.parse(new WDLDocument.Builder(), wdlSource);

      CWLPackage cwlDocument = new WDLTranspiler().convertDocument(wdlDocument);

      ObjectMapper mapper = new ObjectMapper();

      Map<String, Object> inputs = mapper.readValue(workflowInputs, Map.class);

      String response = service.workflowService().create(cwlDocument.workflow, inputs);

      return Response.accepted().entity(response).build();

    } catch (IOException e) {

      throw new BadRequestException("Couldn't parse wdlSource", e);
    }
  }
}
