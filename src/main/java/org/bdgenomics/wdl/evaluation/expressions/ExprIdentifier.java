package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprIdentifier extends WDLExpression {
  public final String value;
  public ExprIdentifier(final String value) { this.value = value; }
  public String toString() { return String.valueOf(value); }

  @Override
  public Object evaluate(Environment env) {
    return env.lookup(value);
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    identifies.add(this);
  }
}
