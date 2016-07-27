package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.util.Arrays;
import org.bdgenomics.BaseTest;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WorkflowTest extends BaseTest {

  @Test
  public void testWorkflowSerializationTest1() throws IOException {
    Workflow workflow = new Workflow(
      list(new InputParameter("inputValue", "string", null)),
      list(new WorkflowOutputParameter("output", "File", null).withSource("#echo/output")),
      list(new WorkflowStep("echo", "echo.cwl",
        list(new WorkflowStepInput("voice", "#inputValue")),
        list(new WorkflowStepOutput("output")))));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(workflow);

    String fixture = fixture("workflow.cwl");

    assertThat(yaml).isEqualTo(fixture);
  }

}
