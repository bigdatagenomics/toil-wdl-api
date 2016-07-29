package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprInequality extends WDLExpression {

  public final WDLExpression left, right;

  public ExprInequality(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s!=%s", left.toString(), right.toString());
  }

  @Override
  public Object evaluate(Environment env) {
    Object lv = left.evaluate(env), rv = right.evaluate(env);
    if(lv == null || rv == null) {
      return lv != rv;
    } else {
      return !lv.equals(rv);
    }
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    left.findIdentifiers(identifies);
    right.findIdentifiers(identifies);
  }
}
