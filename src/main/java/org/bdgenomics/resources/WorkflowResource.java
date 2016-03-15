package org.bdgenomics.resources;

import io.dropwizard.jersey.params.UUIDParam;
import org.bdgenomics.core.Logs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/workflows/v1/{id}")
@Produces(MediaType.APPLICATION_JSON)
public class WorkflowResource {

    @GET
    @Path("logs")
    public Logs logs(@PathParam("id") UUIDParam workflowId) {
        return new Logs(workflowId.toString());
    }

    @GET
    @Path("logs/{callId}")
    public Logs callLogs(@PathParam("id") UUIDParam workflowId,
                                 @PathParam("callId") String callId) {
        return null;
    }

}
