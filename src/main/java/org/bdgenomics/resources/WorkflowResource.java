package org.bdgenomics.resources;

import io.dropwizard.jersey.params.UUIDParam;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;

@Path("/api/workflows/v1/{id}")
@Produces(MediaType.APPLICATION_JSON)
public class WorkflowResource {

    private ToilService service;

    public WorkflowResource(ToilService service) {
        this.service = service;
    }


    @GET
    @Path("logs")
    public Logs logs(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        String[] callIds = service.workflowService().calls(workflowId);
        Logs logs = new Logs(workflowId);
        for(String callId : callIds) {
            logs.addLogLocations(workflowId, Arrays.asList(service.workflowService().callLogs(workflowId, callId)));
        }
        return logs;
    }

    @GET
    @Path("logs/{callId}")
    public Logs callLogs(@PathParam("id") UUIDParam workflowId, @PathParam("callId") String callId) {
        return null;
    }

    @GET
    @Path("status")
    public Status status(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        return new Status(workflowId, service.workflowService().status(workflowId));
    }

}
