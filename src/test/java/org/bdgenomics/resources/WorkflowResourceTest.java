package org.bdgenomics.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.bdgenomics.core.Logs;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.*;

public class WorkflowResourceTest {

    @ClassRule
    public static final ResourceTestRule RULE = ResourceTestRule.builder()
            .addResource(new WorkflowResource())
            .build();

    public final String workflowId = "de305d54-75b4-431b-adb2-eb6b9e546014";
    public final String workflow

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
        assertNotNull(response.logs);
        assertFalse(response.logs.isEmpty());
        assertEquals(response.logs.get())
    }
}
