package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprNegative extends WDLExpression {

  public final WDLExpression inner;

  public ExprNegative(final WDLExpression inner) {
    this.inner = inner;
  }

  public String toString() {
    return String.format("-%s", inner.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Number n = (Number)inner.evaluate(env);
    if(n instanceof Long) {
      return -(Long)n;
    } else if(n instanceof Double) {
      return -(Double)n;
    } else {
      return n;
    }
  }
}
