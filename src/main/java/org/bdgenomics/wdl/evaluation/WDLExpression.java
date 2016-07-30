package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import static org.bdgenomics.utils.HashUtils.hashOrNull;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.evaluation.expressions.ExprAddition;
import org.bdgenomics.wdl.evaluation.expressions.ExprArrayReference;
import org.bdgenomics.wdl.evaluation.expressions.ExprBoolean;
import org.bdgenomics.wdl.evaluation.expressions.ExprConjunction;
import org.bdgenomics.wdl.evaluation.expressions.ExprDisjunction;
import org.bdgenomics.wdl.evaluation.expressions.ExprDivision;
import org.bdgenomics.wdl.evaluation.expressions.ExprEquality;
import org.bdgenomics.wdl.evaluation.expressions.ExprFloat;
import org.bdgenomics.wdl.evaluation.expressions.ExprFunctionApplication;
import org.bdgenomics.wdl.evaluation.expressions.ExprGreaterThan;
import org.bdgenomics.wdl.evaluation.expressions.ExprGreaterThanOrEquals;
import org.bdgenomics.wdl.evaluation.expressions.ExprIdentifier;
import org.bdgenomics.wdl.evaluation.expressions.ExprInequality;
import org.bdgenomics.wdl.evaluation.expressions.ExprInteger;
import org.bdgenomics.wdl.evaluation.expressions.ExprLessThan;
import org.bdgenomics.wdl.evaluation.expressions.ExprLessThanOrEquals;
import org.bdgenomics.wdl.evaluation.expressions.ExprList;
import org.bdgenomics.wdl.evaluation.expressions.ExprMap;
import org.bdgenomics.wdl.evaluation.expressions.ExprModulo;
import org.bdgenomics.wdl.evaluation.expressions.ExprMultiplication;
import org.bdgenomics.wdl.evaluation.expressions.ExprNegative;
import org.bdgenomics.wdl.evaluation.expressions.ExprNot;
import org.bdgenomics.wdl.evaluation.expressions.ExprPositive;
import org.bdgenomics.wdl.evaluation.expressions.ExprString;
import org.bdgenomics.wdl.evaluation.expressions.ExprSubtraction;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserVisitor;

/**
 expression
 : STRING    # String
 | bool      # Boolean
 | INTEGER   # Integer
 | FLOAT     # Float
 | IDENTIFIER    # Identifier
 | expression '[' expression ']'   # ArrayReference
 | expression '(' ( expression (',' expression)* )? ')'  # FunctionApplication
 | '!' expression   # Not
 | '+' expression   # Positive
 | '-' expression   # Negative
 | expression '*' expression   # Multiply
 | expression '%' expression   # Modulo
 | expression '/' expression   # Divide
 | expression '+' expression   # Add
 | expression '-' expression   # Subtract
 | expression '&lt;' expression   # LessThan
 | expression '&lt;=' expression  # LessThanOrEquals
 | expression '&gt;' expression   # GreaterThan
 | expression '&gt;=' expression  # GreaterThanOrEquals
 | expression '==' expression  # Equality
 | expression '!=' expression  # Inequality
 | expression '&amp;&amp;' expression  # And
 | expression '||' expression  # Or
 | '{' ( expression ':' expression)* '}'   # Map
 | '[' expression* ']'    # List
 | '(' expression ')'     # Grouping
 ;
 */
public abstract class WDLExpression implements WDLComponent<WDLExpression> {

  private final String exprType;
  private final WDLExpression[] subExprs;

  public WDLExpression(WDLExpression... subExprs) {
    this.exprType = getClass().getSimpleName();
    this.subExprs = subExprs;
  }

  public int hashCode() {
    return hashAdd(hashOrNull(exprType), hash(subExprs));
  }

  public boolean equals(Object o) {
    if(!(o instanceof WDLExpression)) { return false; }
    WDLExpression e = (WDLExpression)o;
    return
      eq(of(exprType), to(e.exprType)) &&
      eq(of(subExprs), to(e.subExprs));
  }

  public abstract Object evaluate(final Environment env);

  public abstract void findIdentifiers(List<ExprIdentifier> identifies);

  @Override
  public WDLParserVisitor<WDLExpression> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLParserBaseVisitor<WDLExpression> implements WDLBuilder<WDLExpression> {

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.expression();
    }

    /*
    Data structure and function expressions
     */

    @Override
    public WDLExpression visitArrayReference(WDLParser.ArrayReferenceContext ctx) {
      return new ExprArrayReference(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitFunctionApplication(WDLParser.FunctionApplicationContext ctx) {
      ArrayList<WDLExpression> args = new ArrayList<>();
      WDLExpression func = visit(ctx.expression(0));
      for(int i = 1; i < ctx.getChildCount(); i++) {
        args.add(visit(ctx.expression(i)));
      }
      return new ExprFunctionApplication(func, args.toArray(new WDLExpression[args.size()]));
    }

    @Override
    public WDLExpression visitGrouping(WDLParser.GroupingContext ctx) {
      return visit(ctx.expression());
    }

    @Override
    public WDLExpression visitMap(WDLParser.MapContext ctx) {
      ArrayList<WDLExpression> exprs = new ArrayList<>();
      for(WDLParser.ExpressionContext ec : ctx.expression()) {
        exprs.add(visit(ec));
      }
      return new ExprMap(exprs);
    }

    @Override
    public WDLExpression visitList(WDLParser.ListContext ctx) {
      ArrayList<WDLExpression> exprs = new ArrayList<>();
      for(WDLParser.ExpressionContext ec : ctx.expression()) {
        exprs.add(visit(ec));
      }
      return new ExprList(exprs);
    }

    /*
    Literals
     */

    @Override
    public WDLExpression visitIdentifier(WDLParser.IdentifierContext ctx) {
      return new ExprIdentifier(ctx.IDENTIFIER().getSymbol().getText());
    }

    @Override
    public WDLExpression visitString(WDLParser.StringContext ctx) {
      return new ExprString(ctx.STRING().getSymbol().getText());
    }

    @Override
    public WDLExpression visitInteger(WDLParser.IntegerContext ctx) {
      return new ExprInteger(Integer.parseInt(ctx.INTEGER().getSymbol().getText()));
    }

    @Override
    public WDLExpression visitFloat(WDLParser.FloatContext ctx) {
      return new ExprFloat(Double.parseDouble(ctx.FLOAT().getSymbol().getText()));
    }

    @Override
    public WDLExpression visitBool(WDLParser.BoolContext ctx) {
      return new ExprBoolean(Boolean.parseBoolean(ctx.getStart().getText()));
    }

    /*
    Unary Ops
     */

    @Override
    public WDLExpression visitPositive(WDLParser.PositiveContext ctx) {
      return new ExprPositive(visit(ctx.expression()));
    }

    @Override
    public WDLExpression visitNegative(WDLParser.NegativeContext ctx) {
      return new ExprNegative(visit(ctx.expression()));
    }

    @Override
    public WDLExpression visitNot(WDLParser.NotContext ctx) {
      return new ExprNot(visit(ctx.expression()));
    }

    /*
    Binary Ops
     */

    @Override
    public WDLExpression visitAdd(WDLParser.AddContext ctx) {
      return new ExprAddition(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitSubtract(WDLParser.SubtractContext ctx) {
      return new ExprSubtraction(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitMultiply(WDLParser.MultiplyContext ctx) {
      return new ExprMultiplication(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitDivide(WDLParser.DivideContext ctx) {
      return new ExprDivision(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitModulo(WDLParser.ModuloContext ctx) {
      return new ExprModulo(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitAnd(WDLParser.AndContext ctx) {
      return new ExprConjunction(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitOr(WDLParser.OrContext ctx) {
      return new ExprDisjunction(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitLessThan(WDLParser.LessThanContext ctx) {
      return new ExprLessThan(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitGreaterThan(WDLParser.GreaterThanContext ctx) {
      return new ExprGreaterThan(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitLessThanOrEquals(WDLParser.LessThanOrEqualsContext ctx) {
      return new ExprLessThanOrEquals(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitGreaterThanOrEquals(WDLParser.GreaterThanOrEqualsContext ctx) {
      return new ExprGreaterThanOrEquals(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitEquality(WDLParser.EqualityContext ctx) {
      return new ExprEquality(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }

    @Override
    public WDLExpression visitInequality(WDLParser.InequalityContext ctx) {
      return new ExprInequality(visit(ctx.expression(0)), visit(ctx.expression(1)));
    }
  }
}


