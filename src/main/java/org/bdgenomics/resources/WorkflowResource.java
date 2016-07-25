package org.bdgenomics.resources;

import io.dropwizard.jersey.params.UUIDParam;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;
import org.bdgenomics.core.WorkflowMetadata;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

    @POST
    @Path("abort")
    public Status abort(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        return new Status(workflowId, service.workflowService().status(workflowId));
    }

    @GET
    @Path("metadata")
    public WorkflowMetadata metadata(@PathParam("id") UUIDParam workflowUUID) {
        return null;
    }

    @GET
    @Path("status")
    public Status status(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        return new Status(workflowId, service.workflowService().status(workflowId));
    }

    @GET
    @Path("outputs")
    public Status outputs(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        return new Status(workflowId, service.workflowService().status(workflowId));
    }

    @GET
    @Path("logs")
    public Logs logs(@PathParam("id") UUIDParam workflowUUID) {
        String workflowId = workflowUUID.toString();
        Logs logs = new Logs(workflowId);
        return logs;
    }

}
