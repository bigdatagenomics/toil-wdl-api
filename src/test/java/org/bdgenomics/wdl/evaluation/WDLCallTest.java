package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.wdl.evaluation.expressions.ExprAddition;
import org.bdgenomics.wdl.evaluation.expressions.ExprInteger;
import org.junit.Test;

public class WDLCallTest {

  @Test
  public void testParseEmptyCall() throws IOException {
    WDLCall call = WDLEvaluator.parse(new WDLCall.Builder(), "call foo { }");
    assertThat(call).isNotNull();
    assertThat(call.callName).isEqualTo("foo");
    assertThat(call.inputs).isEmpty();

    call = WDLEvaluator.parse(new WDLCall.Builder(), "call foo");
    assertThat(call).isNotNull();
    assertThat(call.callName).isEqualTo("foo");
    assertThat(call.inputs).isEmpty();
  }

  @Test
  public void testParseCall() throws IOException {
    WDLCall call = WDLEvaluator.parse(new WDLCall.Builder(), "call foo { input: x = 1, y = 2+3 }");
    assertThat(call).isNotNull();
    assertThat(call.callName).isEqualTo("foo");
    assertThat(call.inputs.length).isEqualTo(2);
    assertThat(call.inputs[0]).isEqualTo(new WDLCall.CallInput("x", new ExprInteger(1)));
    assertThat(call.inputs[1]).isEqualTo(new WDLCall.CallInput("y",
      new ExprAddition(new ExprInteger(2), new ExprInteger(3))));
  }


}
