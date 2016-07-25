package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.util.Arrays;
import org.bdgenomics.BaseTest;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WorkflowTest extends BaseTest {

  /**
   cwlVersion: cwl:draft-3
   class: Workflow
   inputs:
   - id: voice
   type: string
   outputs:
   - id: said
   type: File
   source: "#echo/output"
   steps:
   - id: echo
   run: echo.cwl
   inputs:
   - id: voice
   source: "#voice"
   outputs:
   - id: output
   */
  @Test
  public void testWorkflowSerializationTest1() throws IOException {
    Workflow workflow = new Workflow(
      list(new InputParameter("voice", "string", null)),
      list(new WorkflowOutputParameter("said", "File", null).withSource("#echo/output")),
      list(new WorkflowStep("echo", "echo.cwl",
        list(new WorkflowStepInput("voice", "#voice")),
        list(new WorkflowStepOutput("output")))));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(workflow);

    String fixture = fixture("workflow.cwl");

    assertThat(yaml).isEqualTo(fixture);
  }

}
