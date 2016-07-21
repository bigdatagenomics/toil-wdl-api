package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.junit.Test;

public class WDLCallTest {

  @Test
  public void testParseEmptyCall() throws IOException {
    WDLCall call = WDLEvaluator.parse(new WDLCall.Builder(), "call foo { }");
    assertThat(call).isNotNull();
    assertThat(call.callName).isEqualTo("foo");
    assertThat(call.inputs).isEmpty();
  }

}
