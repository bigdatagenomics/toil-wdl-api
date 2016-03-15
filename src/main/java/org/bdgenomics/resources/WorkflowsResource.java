package org.bdgenomics.resources;

import org.bdgenomics.core.WorkflowsQueryResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/workflows/v1")
@Produces(MediaType.APPLICATION_JSON)
public class WorkflowsResource {

    @GET
    @Path("query")
    public WorkflowsQueryResponse query() {
        return null;
    }

    @POST
    public void createWorkflow() {

    }

    @POST
    @Path("validate")
    public void validateWorkflow() {

    }
}
