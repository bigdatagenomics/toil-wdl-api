package org.bdgenomics.wdl.evaluation.expressions;

import static java.util.stream.Collectors.joining;
import java.util.function.Function;
import java.util.stream.Stream;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.FunctionValue;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprFunctionApplication extends WDLExpression {

  public final WDLExpression function;
  public final WDLExpression[] arguments;

  public ExprFunctionApplication(WDLExpression function, WDLExpression... args) {
    this.function = function;
    this.arguments = args;
  }

  public String toString() {
    return String.format("%s(%s)", function.toString(),
      Stream.of(arguments).map(WDLExpression::toString).collect(joining(",")));
  }

  @Override
  public Object evaluate(Environment env) {
    FunctionValue f = (FunctionValue)function.evaluate(env);
    Object[] args = new Object[arguments.length];
    for(int i = 0; i < args.length; i++) {
      args[i] = arguments[i].evaluate(env);
    }
    return f.apply(args);
  }
}
