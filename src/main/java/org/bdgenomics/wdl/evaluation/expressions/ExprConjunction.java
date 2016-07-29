package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprConjunction extends WDLExpression {

  public final WDLExpression left, right;

  public ExprConjunction(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s&&%s", left.toString(), right.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Boolean leftv = (Boolean)left.evaluate(env), rightv = (Boolean)right.evaluate(env);
    return (leftv && rightv);
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    left.findIdentifiers(identifies);
    right.findIdentifiers(identifies);
  }
}
