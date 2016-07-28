package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.eq;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.evaluation.types.*;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserVisitor;

/**
 primitive_type : 'Boolean' | 'Int' | 'Float' | 'File' | 'String' ;
 array_type:  'Array' '[' (primitive_type | object_type | array_type) ']';
 object_type:  'Object' ;
 map_type: 'Map' '[' primitive_type ',' (primitive_type | array_type | map_type | object_type) ']' ;
 type_postfix_quantifier:  '!' | '?' ;
 *
 */
public abstract class WDLType implements WDLComponent<WDLType> {

  public static final Set<String> PRIMITIVE_NAMES =
    new TreeSet<>(Arrays.asList("String", "Int", "Float", "Boolean", "File"));

  public static final PrimitiveType STRING = new StringType();
  public static final PrimitiveType BOOLEAN = new BooleanType();
  public static final PrimitiveType INT = new IntType();
  public static final PrimitiveType FLOAT = new FloatType();
  public static final PrimitiveType FILE = new FileType();

  public static final WDLType TOP = new TopType();

  public static PrimitiveType parsePrimitiveType(String name) {
    if(name.equals("String")) { return STRING; }
    if(name.equals("Boolean")) { return BOOLEAN; }
    if(name.equals("Int")) { return INT; }
    if(name.equals("Float")) { return FLOAT; }
    if(name.equals("File")) { return FILE; }
    throw new IllegalArgumentException(name);
  }

  @Override
  public WDLParserVisitor<WDLType> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLParserBaseVisitor<WDLType> implements WDLBuilder<WDLType> {

    public WDLType visitType(WDLParser.TypeContext ctx) {
      ParseTree pctx = ctx.type_postfix_quantifier();
      String postfixNullable = pctx != null ? pctx.getText() : null;

      WDLType type = null;
      if(ctx.primitive_type() != null) {
        type = visit(ctx.primitive_type());

      } else if(ctx.array_type() != null) {
        type = visit(ctx.array_type());

      } else if(ctx.map_type() != null) {
        type = visit(ctx.map_type());

      } else if(ctx.object_type() != null) {
        type = visit(ctx.object_type());
      }

      if(postfixNullable != null) {
        if(postfixNullable.equals("?")) {
          type = new OptionalType(type);
        } else if (postfixNullable.equals("+")) {
          type = new NonEmptyType((ArrayType)type);
        } else {
          throw new ParsingException(String.format("Illegal postfix operator in type \"%s\"", ctx.toString()));
        }
      }

      return type;
    }

    @Override
    public WDLType visitArray_type(WDLParser.Array_typeContext ctx) {
      return new ArrayType(visit(ctx.array_component_type()));
    }

    @Override
    public WDLType visitObject_type(WDLParser.Object_typeContext ctx) {
      return new ObjectType();
    }

    @Override
    public WDLType visitMap_type(WDLParser.Map_typeContext ctx) {
      return new MapType(
        visit(ctx.map_key_type()),
        visit(ctx.map_value_type()));
    }

    @Override
    public WDLType visitPrimitive_type(WDLParser.Primitive_typeContext ctx) {
      String name = ctx.getText();
      return parsePrimitiveType(name);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.type();
    }
  }
}


