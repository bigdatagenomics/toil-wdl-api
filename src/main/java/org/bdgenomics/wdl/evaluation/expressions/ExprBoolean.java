package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprBoolean extends WDLExpression {
  public final Boolean value;
  public ExprBoolean(final Boolean value) { this.value = value; }
  public String toString() { return String.valueOf(value); }

  @Override
  public Object evaluate(Environment env) {
    return value;
  }
}
