package org.bdgenomics.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.bdgenomics.api.LogService;
import org.bdgenomics.api.ToilService;
import org.bdgenomics.core.LogLocations;
import org.bdgenomics.core.Logs;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;

public class WorkflowResourceTest {

    public static final ToilService service = new ToilService() {
        @Override
        public LogService logService() {
            return new LogService() {

                @Override
                public LogLocations getLogLocations(String workflowId) {
                    return new LogLocations("foo", "bar");
                }
            };
        }
    };

    @ClassRule
    public static final ResourceTestRule RULE = ResourceTestRule.builder()
            .addResource(new WorkflowResource(service))
            .build();

    public final String workflowId = "de305d54-75b4-431b-adb2-eb6b9e546014";
    public final String workflowStdout = "foo";
    public final String workflowStderr = "bar";

    @Test
    public void testLogsIdIsCorrect() {

        Logs response = RULE.getJerseyTest()
                .target("/api/workflows/v1/" + workflowId + "/logs")
                .request(MediaType.APPLICATION_JSON)
                .get(Logs.class);

        assertNotNull(response);
        assertEquals(workflowId, response.id);
    }

    @Test
    public void testLogsContainsLogLocations() {

        Logs response = RULE.getJerseyTest()
                .target("/api/workflows/v1/" + workflowId + "/logs")
                .request(MediaType.APPLICATION_JSON)
                .get(Logs.class);

        assertNotNull(response);
        assertNotNull("response.logs was null", response.logs);
        assertFalse(response.logs.isEmpty());
        assertNotNull(response.logs.get(workflowId));
    }
}
