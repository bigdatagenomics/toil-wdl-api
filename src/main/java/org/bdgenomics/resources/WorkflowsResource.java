package org.bdgenomics.resources;

import java.io.IOException;
import java.util.Map;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.cwl.WDL2CWLConverter;
import org.bdgenomics.cwl.Workflow;
import org.bdgenomics.wdl.evaluation.WDLEvaluator;
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
  @Consumes("multipart/form-data")
  public Response create(@FormParam("wdlSource") String wdlSource,
                         @FormParam("workflowInputs") String workflowInputs,
                         @FormParam("workflowOptions") String workflowOptions) {

    try {
      WDLWorkflow wdlWorkflow = WDLEvaluator.parse(new WDLWorkflow.Builder(), wdlSource);

      Workflow cwlWorkflow = WDL2CWLConverter.convertWorkflow(wdlWorkflow);

      ObjectMapper mapper = new ObjectMapper();

      Map<String, Object> inputs = mapper.readValue(workflowInputs, Map.class);

      String response = service.workflowService().create(cwlWorkflow, inputs);

      return Response.accepted().entity(response).build();

    } catch (IOException e) {

      throw new BadRequestException("Couldn't parse wdlSource", e);
    }
  }
}
