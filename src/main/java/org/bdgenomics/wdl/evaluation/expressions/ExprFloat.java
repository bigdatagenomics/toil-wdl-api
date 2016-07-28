package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprFloat extends WDLExpression {
  public final Double value;
  public ExprFloat(final Double value) { this.value = value; }
  public String toString() { return String.valueOf(value); }

  @Override
  public Object evaluate(Environment env) {
    return value;
  }
}
