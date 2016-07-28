package org.bdgenomics.wdl.evaluation.expressions;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Collection;
import java.util.stream.Stream;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprList extends WDLExpression {

  public final WDLExpression[] arguments;

  public ExprList(final Collection<WDLExpression> args) {
    this.arguments = args.toArray(new WDLExpression[args.size()]);
  }

  public String toString() {
    return String.format("[%s]",
      Stream.of(arguments).map(WDLExpression::toString).collect(joining(", ")));
  }

  @Override
  public Object evaluate(Environment env) {
    return Stream.of(arguments).map(arg -> arg.evaluate(env)).collect(toList());
  }
}
