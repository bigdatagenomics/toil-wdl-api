package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserVisitor;
import com.google.common.base.Preconditions;

/**
 * Represents a typed variable declaration, with an optional initializer expression,
 * that is given at the top of a WDL block (notably, the `task` blocks).
 *
 * $declaration : $type $identifier ('=' $expression)?
 */
public class WDLDeclaration implements WDLComponent<WDLDeclaration> {

  public final WDLType type;
  public final String identifier;
  public final WDLExpression initializer;

  public WDLDeclaration(final WDLType type, final String identifier, final WDLExpression initializer) {
    Preconditions.checkNotNull(type);
    Preconditions.checkNotNull(identifier);

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

  public String toString() {
    return String.format("%s %s%s", type, identifier,
      initializer != null ? String.format(" = %s", initializer.toString()) : "");
  }

  @Override
  public WDLParserVisitor<WDLDeclaration> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLParserBaseVisitor<WDLDeclaration> implements WDLBuilder<WDLDeclaration> {

    @Override
    public WDLDeclaration visitDeclaration(WDLParser.DeclarationContext ctx) {
      final WDLType type = new WDLType.Builder().visit(ctx.type());
      if(type == null) {
        throw new ParsingException(String.format("Couldn't parse type in declaration string \"%s\"", ctx.getText()));
      }

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
