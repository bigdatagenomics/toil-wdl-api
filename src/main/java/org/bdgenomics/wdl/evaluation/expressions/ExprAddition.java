package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprAddition extends WDLExpression {

  public final WDLExpression left, right;

  public ExprAddition(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s+%s", left.toString(), right.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Object leftval = left.evaluate(env), rightval = right.evaluate(env);

    if(leftval instanceof String || rightval instanceof String) {
      String lefts = ((String)leftval), rights = (String)rightval;
      return lefts + rights;

    } else  if(leftval instanceof Double || rightval instanceof Double) {
      Double leftd = ((Number)leftval).doubleValue(), rightd = ((Number)rightval).doubleValue();
      return leftd + rightd;

    } else {
      Long leftd = ((Number)leftval).longValue(), rightd = ((Number)rightval).longValue();
      return leftd + rightd;
    }
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    left.findIdentifiers(identifies);
    right.findIdentifiers(identifies);
  }
}
