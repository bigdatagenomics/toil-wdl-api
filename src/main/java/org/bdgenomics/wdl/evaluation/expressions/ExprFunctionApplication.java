package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
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
    StringBuilder sb = new StringBuilder();
    for(WDLExpression expr : arguments) {
      if(sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(expr.toString());
    }
    return String.format("%s(%s)", function.toString(), sb.toString());
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

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    function.findIdentifiers(identifies);
    for(WDLExpression arg : arguments) {
      arg.findIdentifiers(identifies);
    }
  }
}
