package org.bdgenomics.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.*;
import static org.junit.Assert.*;

public class StatusTest {

    @Test
    public void testStatusJSON() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals("{}", mapper.writeValueAsString(new Status()));
        assertEquals("{\"id\":\"foo\"}", mapper.writeValueAsString(new Status().withId("foo")));
        assertEquals("{\"id\":\"foo\",\"status\":\"completed\"}",
                mapper.writeValueAsString(new Status().withId("foo").withStatus("completed")));
    }
}
