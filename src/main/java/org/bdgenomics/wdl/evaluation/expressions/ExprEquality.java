package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprEquality extends WDLExpression {

  public final WDLExpression left, right;

  public ExprEquality(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s==%s", left.toString(), right.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Object lv = left.evaluate(env), rv = right.evaluate(env);
    if(lv == null || rv == null) {
      return lv == rv;
    } else {
      return lv.equals(rv);
    }
  }
}
