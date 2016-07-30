package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.wdl.evaluation.expressions.ExprAddition;
import org.bdgenomics.wdl.evaluation.expressions.ExprInteger;
import org.bdgenomics.wdl.evaluation.expressions.ExprMultiplication;
import org.junit.Test;

public class WDLExpressionTest {

  @Test
  public void testExprMultiplication() throws IOException {
    WDLExpression expr = WDLEvaluator.parse(new WDLExpression.Builder(), "1024*1024*1024*3");
    assertThat(expr).isInstanceOf(ExprMultiplication.class);
    assertThat(expr.evaluate(new Environment())).isEqualTo(1024L*1024*1024*3);
  }

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
