package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.*;
import java.io.IOException;
import org.junit.Test;

public class WDLExpressionTest {

  @Test
  public void testExprAdditionParsing() throws IOException {
    WDLExpression expr = WDLEvaluator.parse(new WDLExpression.Builder(), "3 + 5");
    assertThat(expr).isInstanceOf(ExprAddition.class);
    assertThat(expr.toString()).isEqualTo("3+5");

    expr = WDLEvaluator.parse(new WDLExpression.Builder(), "3 + 5 * 6");
    assertThat(expr).isInstanceOf(ExprAddition.class);
    assertThat(expr.toString()).isEqualTo("3+5*6");
    assertThat(((ExprAddition)expr).right).isInstanceOf(ExprMultiplication.class);
  }

  @Test
  public void testExprGrouping() throws IOException {
    WDLExpression expr = WDLEvaluator.parse(new WDLExpression.Builder(), "(3)");
    assertThat(expr).isNotNull();
    assertThat(expr).isInstanceOf(ExprInteger.class);

    expr = WDLEvaluator.parse(new WDLExpression.Builder(), "2+(3*5)");
    assertThat(expr).isNotNull();
    assertThat(expr).isInstanceOf(ExprAddition.class);

    expr = WDLEvaluator.parse(new WDLExpression.Builder(), "(2+3)*5");
    assertThat(expr).isNotNull();
    assertThat(expr).isInstanceOf(ExprMultiplication.class);
  }

}
