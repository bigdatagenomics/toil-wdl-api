package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

/**
 * Represents a typed variable declaration, with an optional initializer expression,
 * that is given at the top of a WDL block (notably, the `task` blocks).
 *
 * $declaration : $type $identifier ('=' $expression)?
 */
public class WDLDeclaration implements WDLComponent<WDLDeclaration> {

  public final String type;
  public final String identifier;
  public final WDLExpression initializer;

  public WDLDeclaration(final String type, final String identifier, final WDLExpression initializer) {
    this.type = type;
    this.identifier = identifier;
    this.initializer = initializer;
  }

  public int hashCode() {
    return hash(type, identifier, initializer);
  }

  public boolean equals(Object o) {
    if(!( o instanceof WDLDeclaration )) { return false; }
    WDLDeclaration d = (WDLDeclaration) o;
    return eq(of(identifier, type, initializer), to(d.identifier, d.type, d.initializer));
  }

  @Override
  public WDLVisitor<WDLDeclaration> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLDeclaration> implements WDLBuilder<WDLDeclaration> {

    @Override
    public WDLDeclaration visitDeclaration(WDLParser.DeclarationContext ctx) {
      final String type = ctx.type().getText();
      final String name = ctx.IDENTIFIER().getSymbol().getText();
      WDLExpression init = null;

      WDLParser.ExpressionContext exprCtx = ctx.expression();
      if(exprCtx != null) {
        init = new WDLExpression.Builder().visit(ctx.expression());
      }

      return new WDLDeclaration(type, name, init);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.declaration();
    }
  }

}
