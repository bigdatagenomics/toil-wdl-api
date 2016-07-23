package org.bdgenomics.wdl.evaluation;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import static org.bdgenomics.utils.HashUtils.hashOrNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

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
public class WDLExpression implements WDLComponent<WDLExpression> {

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

  @Override
  public WDLVisitor<WDLExpression> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLExpression> implements WDLBuilder<WDLExpression> {

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
      List<WDLExpression> exprs = ctx.expression().stream().map(this::visit).collect(toList());
      return new ExprMap(exprs);
    }

    @Override
    public WDLExpression visitList(WDLParser.ListContext ctx) {
      List<WDLExpression> exprs = ctx.expression().stream().map(this::visit).collect(toList());
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

class ExprArrayReference extends WDLExpression {

  public final WDLExpression arrayExpr, index;

  public ExprArrayReference(WDLExpression array, WDLExpression index) {
    this.arrayExpr = array;
    this.index = index;
  }

  public String toString() { return String.format("%s[%s]", arrayExpr.toString(), index.toString()); }
}

class ExprFunctionApplication extends WDLExpression {

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
}

class ExprList extends WDLExpression {

  public final WDLExpression[] arguments;

  public ExprList(final Collection<WDLExpression> args) {
    this.arguments = args.toArray(new WDLExpression[args.size()]);
  }

  public String toString() {
    return String.format("[%s]",
      Stream.of(arguments).map(WDLExpression::toString).collect(joining(", ")));
  }
}

class ExprMap extends WDLExpression {

  public final WDLExpression[] keys, values;

  public ExprMap(final Collection<WDLExpression> args) {
    int i = 0;
    keys = new WDLExpression[args.size()/2];
    values = new WDLExpression[keys.length];
    for(WDLExpression e : args) {
      if(i % 2 == 0) {
        keys[i/2] = e;
      } else {
        values[i/2] = e;
      }
      i++;
    }
  }

  public String toString() {
    return String.format("{%s}",
      IntStream.range(0, keys.length)
        .mapToObj(i -> String.format("%s : %s", keys[i].toString(), values[i].toString()))
        .collect(joining(", ")));
  }
}

/*
 * Value Expressions
 */

class ExprString extends WDLExpression {
  public final String value;
  public ExprString(final String value) { this.value = value; }

  public String toString() { return value; }
}

class ExprInteger extends WDLExpression {
  public final Integer value;
  public ExprInteger(final Integer value) { this.value = value; }
  public String toString() { return String.valueOf(value); }
}

class ExprFloat extends WDLExpression {
  public final Double value;
  public ExprFloat(final Double value) { this.value = value; }
  public String toString() { return String.valueOf(value); }
}

class ExprIdentifier extends WDLExpression {
  public final String value;
  public ExprIdentifier(final String value) { this.value = value; }
  public String toString() { return String.valueOf(value); }
}

class ExprBoolean extends WDLExpression {
  public final Boolean value;
  public ExprBoolean(final Boolean value) { this.value = value; }
  public String toString() { return String.valueOf(value); }
}


/*
 * Unary Ops
 */

class ExprNegative extends WDLExpression {

  public final WDLExpression inner;

  public ExprNegative(final WDLExpression inner) {
    this.inner = inner;
  }

  public String toString() {
    return String.format("-%s", inner.toString());
  }
}

class ExprPositive extends WDLExpression {

  public final WDLExpression inner;

  public ExprPositive(final WDLExpression inner) {
    this.inner = inner;
  }
  public String toString() {
    return String.format("+%s", inner.toString());
  }
}

class ExprNot extends WDLExpression {

  public final WDLExpression inner;

  public ExprNot(final WDLExpression inner) {
    this.inner = inner;
  }
  public String toString() {
    return String.format("!%s", inner.toString());
  }
}

/*
 * Binary Ops
 */

class ExprAddition extends WDLExpression {

  public final WDLExpression left, right;

  public ExprAddition(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s+%s", left.toString(), right.toString());
  }
}

class ExprSubtraction extends WDLExpression {

  public final WDLExpression left, right;

  public ExprSubtraction(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s-%s", left.toString(), right.toString());
  }
}

class ExprMultiplication extends WDLExpression {

  public final WDLExpression left, right;

  public ExprMultiplication(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s*%s", left.toString(), right.toString());
  }
}

class ExprDivision extends WDLExpression {

  public final WDLExpression left, right;

  public ExprDivision(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s/%s", left.toString(), right.toString());
  }
}

class ExprModulo extends WDLExpression {

  public final WDLExpression left, right;

  public ExprModulo(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s%%%s", left.toString(), right.toString());
  }
}

class ExprEquality extends WDLExpression {

  public final WDLExpression left, right;

  public ExprEquality(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s==%s", left.toString(), right.toString());
  }
}

class ExprInequality extends WDLExpression {

  public final WDLExpression left, right;

  public ExprInequality(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s!=%s", left.toString(), right.toString());
  }
}

class ExprConjunction extends WDLExpression {

  public final WDLExpression left, right;

  public ExprConjunction(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s&&%s", left.toString(), right.toString());
  }
}

class ExprDisjunction extends WDLExpression {

  public final WDLExpression left, right;

  public ExprDisjunction(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s||%s", left.toString(), right.toString());
  }
}

class ExprLessThan extends WDLExpression {

  public final WDLExpression left, right;

  public ExprLessThan(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s<%s", left.toString(), right.toString());
  }
}

class ExprLessThanOrEquals extends WDLExpression {

  public final WDLExpression left, right;

  public ExprLessThanOrEquals(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s<=%s", left.toString(), right.toString());
  }
}

class ExprGreaterThan extends WDLExpression {

  public final WDLExpression left, right;

  public ExprGreaterThan(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s>%s", left.toString(), right.toString());
  }
}

class ExprGreaterThanOrEquals extends WDLExpression {

  public final WDLExpression left, right;

  public ExprGreaterThanOrEquals(WDLExpression left, WDLExpression right) {
    this.left = left;
    this.right = right;
  }
  public String toString() {
    return String.format("%s>=%s", left.toString(), right.toString());
  }
}

