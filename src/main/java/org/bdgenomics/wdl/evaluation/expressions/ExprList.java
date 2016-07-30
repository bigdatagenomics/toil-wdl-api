package org.bdgenomics.wdl.evaluation.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprList extends WDLExpression {

  public final WDLExpression[] arguments;

  public ExprList(final Collection<WDLExpression> args) {
    this.arguments = args.toArray(new WDLExpression[args.size()]);
  }

  public String toString() {
    return Arrays.asList(arguments).toString();
  }

  @Override
  public Object evaluate(Environment env) {
    ArrayList<Object> evaled = new ArrayList<>();
    for(WDLExpression arg : arguments) { evaled.add(arg.evaluate(env)); }
    return evaled;
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    for(WDLExpression arg : arguments) {
      arg.findIdentifiers(identifies);
    }
  }
}
