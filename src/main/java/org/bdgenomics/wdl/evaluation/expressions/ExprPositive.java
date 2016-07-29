package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprPositive extends WDLExpression {

  public final WDLExpression inner;

  public ExprPositive(final WDLExpression inner) {
    this.inner = inner;
  }
  public String toString() {
    return String.format("+%s", inner.toString());
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    inner.findIdentifiers(identifies);
  }

  @Override
  public Object evaluate(Environment env) {
    Number n = (Number)inner.evaluate(env);
    if(n instanceof Long) {
      return +(Long)n;
    } else if(n instanceof Double) {
      return +(Double)n;
    } else {
      return n;
    }
  }
}
