package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.BaseTest;
import org.bdgenomics.wdl.evaluation.WDLDocument;
import org.bdgenomics.wdl.evaluation.WDLEvaluator;
import org.bdgenomics.wdl.evaluation.WDLTask;
import org.bdgenomics.wdl.evaluation.WDLWorkflow;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WDLTranspilerTest extends BaseTest {

  @Test
  public void testEchoTaskTranspilation() throws IOException {
    String echoWDL = fixture("echo.wdl");
    WDLTask task = WDLEvaluator.parse(new WDLTask.Builder(), echoWDL);

    WDLTranspiler transpiler = new WDLTranspiler();
    CommandLineTool transpiled = transpiler.convertTask(task);

    CWLObjectMapper mapper = new CWLObjectMapper();
    String outputCWL = mapper.writeValueAsString(transpiled);

    String echoCWL = fixture("echo.cwl");
    assertThat(outputCWL).isEqualTo(echoCWL);
  }

  @Test
  public void testEchoWorkflowTranspilation() throws IOException {
    String echoWDL = fixture("workflow.wdl");
    System.out.println(String.format("Input WDL:\n%s", echoWDL));
    WDLDocument document = WDLEvaluator.parse(new WDLDocument.Builder(), echoWDL);

    ObjectMapper jsonMapper = new ObjectMapper();
    //System.out.println(String.format("Input WDL-as-JSON:\n" + jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(document)));

    WDLTranspiler transpiler = new WDLTranspiler();
    CWLPackage transpiled = transpiler.convertDocument(document);

    CWLObjectMapper mapper = new CWLObjectMapper();
    String outputCWL = mapper.writeValueAsString(transpiled.workflow);

    String echoCWL = fixture("workflow.cwl");

    System.out.println("Transpiled:\n" + outputCWL);
    System.out.println("\n\nTarget:\n" + echoCWL);

    assertThat(outputCWL).isEqualTo(echoCWL);
  }


}
