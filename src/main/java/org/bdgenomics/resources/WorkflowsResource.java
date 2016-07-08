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

    @POST
    public void create() {
    }

    @GET
    @Path("query")
    public WorkflowsQueryResponse query() {
        return null;
    }

    @POST
    @Path("validate")
    public void validate() {

    }

    @POST
    @Path("abort")
    public void abort() {

    }

    @POST
    @Path("call-caching/{callId}")
    public void callCaching() {

    }

    @POST
    @Path("call-caching")
    public void caching() {

    }

}
