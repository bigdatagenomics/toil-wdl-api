package org.bdgenomics.wdl.evaluation;

import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

public class WDLExpression implements WDLComponent<WDLExpression> {

  @Override
  public WDLVisitor<WDLExpression> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLExpression> implements WDLBuilder<WDLExpression> {

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.expression();
    }

    @Override
    public WDLExpression visitAdd(WDLParser.AddContext ctx) {
      return new ExprAddition(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitGrouping(WDLParser.GroupingContext ctx) {
      return visit(ctx.expression());
    }
  }
}

class ExprAddition extends WDLExpression {

  public final WDLExpression left, right;

  public ExprAddition(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
}
