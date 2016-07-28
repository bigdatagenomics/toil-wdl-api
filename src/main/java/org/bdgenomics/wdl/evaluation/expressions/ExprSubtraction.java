package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprSubtraction extends WDLExpression {

  public final WDLExpression left, right;

  public ExprSubtraction(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s-%s", left.toString(), right.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Object leftval = left.evaluate(env), rightval = right.evaluate(env);
    if(leftval instanceof Double || rightval instanceof Double) {
      Double leftd = ((Number)leftval).doubleValue(), rightd = ((Number)rightval).doubleValue();
      return leftd - rightd;
    } else {
      Long leftd = ((Number)leftval).longValue(), rightd = ((Number)rightval).longValue();
      return leftd - rightd;
    }
  }
}
