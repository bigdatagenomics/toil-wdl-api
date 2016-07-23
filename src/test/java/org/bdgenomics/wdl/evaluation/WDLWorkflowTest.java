package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.junit.Test;

public class WDLWorkflowTest {

  @Test
  public void testEmptyWorkflow() throws IOException {
    WDLWorkflow workflow = WDLEvaluator.parse(new WDLWorkflow.Builder(), "workflow wf { } ");
    assertThat(workflow).isNotNull();
    assertThat(workflow.name).isEqualTo("wf");
    assertThat(workflow.workflowSteps).isEmpty();
  }

  @Test
  public void testWorkflowWithCalls() throws IOException {
    WDLWorkflow workflow = WDLEvaluator.parse(new WDLWorkflow.Builder(), "workflow wf { call step1 call step2  } ");
    assertThat(workflow).isNotNull();
    assertThat(workflow.name).isEqualTo("wf");
    assertThat(workflow.workflowSteps.length).isEqualTo(2);
    assertThat(workflow.workflowSteps).containsExactly(
      new WDLCall("step1"),
      new WDLCall("step2")
    );
  }

}
