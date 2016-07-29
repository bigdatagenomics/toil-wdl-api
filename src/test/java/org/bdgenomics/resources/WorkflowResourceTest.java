package org.bdgenomics.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.api.WorkflowService;
import org.bdgenomics.core.LogLocations;
import org.bdgenomics.core.Logs;
import org.bdgenomics.core.Status;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WorkflowResourceTest {

    public static final ToilService service = mock(ToilService.class);

    @ClassRule
    public static final ResourceTestRule RULE = ResourceTestRule.builder()
            .addResource(new WorkflowResource(service))
            .build();

    public final static String workflowId = "de305d54-75b4-431b-adb2-eb6b9e546014";
    public final static String callId = "callid";
    public final static String workflowStdout = "foo";
    public final static String workflowStderr = "bar";

    @BeforeClass
    public static void initMocks() {
        WorkflowService workflowMock = mock(WorkflowService.class);
        when(workflowMock.status(workflowId)).thenReturn("complete");

        when(service.workflowService()).thenReturn(workflowMock);
    }

    //@Test
    public void testLogsIdIsCorrect() {

        Logs response = RULE.getJerseyTest()
                .target("/api/workflows/v1/" + workflowId + "/logs")
                .request(MediaType.APPLICATION_JSON)
                .get(Logs.class);

        assertNotNull(response);
        assertEquals(workflowId, response.id);
    }

    //@Test
    public void testLogsContainsLogLocations() {

        Logs response = RULE.getJerseyTest()
                .target("/api/workflows/v1/" + workflowId + "/logs")
                .request(MediaType.APPLICATION_JSON)
                .get(Logs.class);

        assertNotNull(response);
    }

    @Test
    public void testStatusIsComplete() {
        Status response = RULE.getJerseyTest()
                .target("/api/workflows/v1/" + workflowId + "/status")
                .request(MediaType.APPLICATION_JSON)
                .get(Status.class);

        assertNotNull(response);
        assertEquals(workflowId, response.getId());
        assertEquals("complete", response.getStatus());
    }
}
