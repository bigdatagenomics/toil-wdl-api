package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprNot extends WDLExpression {

  public final WDLExpression inner;

  public ExprNot(final WDLExpression inner) {
    this.inner = inner;
  }
  public String toString() {
    return String.format("!%s", inner.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Boolean n = (Boolean)inner.evaluate(env);
    Boolean notN = !n;
    return notN;
  }
}
