package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.BaseTest;
import org.bdgenomics.wdl.evaluation.WDLEvaluator;
import org.bdgenomics.wdl.evaluation.WDLTask;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WDLTranspilerTest extends BaseTest {

  @Test
  public void testEchoWDLTranspilation() throws IOException {
    String echoWDL = fixture("echo.wdl");
    WDLTask task = WDLEvaluator.parse(new WDLTask.Builder(), echoWDL);

    ObjectMapper jsonMapper = new ObjectMapper();

    WDLTranspiler transpiler = new WDLTranspiler();
    CommandLineTool transpiled = transpiler.convertTask(task);

    CWLObjectMapper mapper = new CWLObjectMapper();
    String outputCWL = mapper.writeValueAsString(transpiled);

    String echoCWL = fixture("echo.cwl");
    assertThat(outputCWL).isEqualTo(echoCWL);
  }

}
