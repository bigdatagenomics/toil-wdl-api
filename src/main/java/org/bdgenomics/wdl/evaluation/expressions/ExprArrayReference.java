package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprArrayReference extends WDLExpression {

  public final WDLExpression arrayExpr, index;

  public ExprArrayReference(WDLExpression array, WDLExpression index) {
    this.arrayExpr = array;
    this.index = index;
  }

  public String toString() { return String.format("%s[%s]", arrayExpr.toString(), index.toString()); }

  @Override
  public Object evaluate(Environment env) {
    List list = (List)arrayExpr.evaluate(env);
    Integer i = (Integer)index.evaluate(env);
    return list.get(i);
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    arrayExpr.findIdentifiers(identifies);
    index.findIdentifiers(identifies);
  }
}
