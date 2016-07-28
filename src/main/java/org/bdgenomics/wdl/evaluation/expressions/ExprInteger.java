package org.bdgenomics.wdl.evaluation.expressions;

import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprInteger extends WDLExpression {
  public final Long value;

  public ExprInteger(final Integer value) { this.value = value.longValue(); }
  public ExprInteger(final Long value) { this.value = value; }

  public String toString() { return String.valueOf(value); }

  @Override
  public Object evaluate(Environment env) {
    return value;
  }
}
