package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;
import com.google.common.base.Preconditions;

/**
 primitive_type : 'Boolean' | 'Int' | 'Float' | 'File' | 'String' ;
 array_type:  'Array' '[' (primitive_type | object_type | array_type) ']';
 object_type:  'Object' ;
 map_type: 'Map' '[' primitive_type ',' (primitive_type | array_type | map_type | object_type) ']' ;
 type_postfix_quantifier:  '!' | '?' ;
 *
 */
public abstract class WDLType implements WDLComponent<WDLType> {

  @Override
  public WDLVisitor<WDLType> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLType> implements WDLBuilder<WDLType> {

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
      return new PrimitiveType(name);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.type();
    }
  }
}

class NonEmptyType extends WDLType {

  public final ArrayType innerType;

  public NonEmptyType(final ArrayType inner) {
    Preconditions.checkNotNull(inner);
    this.innerType = inner;
  }

  public int hashCode() { return hashAdd("+".hashCode(), innerType.hashCode()); }

  public boolean equals(Object o) {
    if(!(o instanceof NonEmptyType)) { return false; }
    NonEmptyType t = (NonEmptyType)o;
    return innerType.equals(t.innerType);
  }

  public String toString() { return innerType.toString() + "+"; }
}

class OptionalType extends WDLType {

  public final WDLType innerType;

  public OptionalType(final WDLType inner) {
    Preconditions.checkNotNull(inner);
    this.innerType = inner;
  }

  public int hashCode() { return hashAdd("?".hashCode(), innerType.hashCode()); }

  public boolean equals(Object o) {
    if(!(o instanceof OptionalType)) { return false; }
    OptionalType t = (OptionalType)o;
    return innerType.equals(t.innerType);
  }

  public String toString() { return innerType.toString() + "?"; }
}


class PrimitiveType extends WDLType {

  public final String typeName;

  public static final Set<String> PRIMITIVE_NAMES =
    new TreeSet<>(Arrays.asList("String", "Int", "Float", "Boolean", "File"));

  public PrimitiveType(final String name) {
    Preconditions.checkNotNull(name);
    Preconditions.checkArgument(PRIMITIVE_NAMES.contains(name));
    this.typeName = name;
  }

  public String toString() { return typeName; }

  public int hashCode() { return hash(typeName); }

  public boolean equals(Object o) {
    if(!(o instanceof PrimitiveType)) { return false; }
    PrimitiveType t = (PrimitiveType)o;
    return t.typeName.equals(typeName);
  }
}

class MapType extends WDLType {

  public final WDLType keyType, valueType;

  public MapType(final WDLType keyType, final WDLType valueType) {
    Preconditions.checkNotNull(keyType);
    Preconditions.checkNotNull(valueType);

    this.keyType = keyType;
    this.valueType = valueType;
  }

  public int hashCode() {
    return hashAdd("Map".hashCode(), hash(keyType, valueType));
  }

  public boolean equals(Object o) {
    if(!(o instanceof MapType)) { return false; }
    MapType t = (MapType)o;
    return eq(of(keyType, valueType), to(t.keyType, t.valueType));
  }

  public String toString() { return String.format("Map[%s,%s]", keyType.toString(), valueType.toString()); }
}

class ObjectType extends WDLType {

  public ObjectType() {
  }

  public int hashCode() { return "Object".hashCode(); }

  public boolean equals(Object o) {
    return o instanceof ObjectType;
  }

  public String toString() { return "Object"; }
}

class ArrayType extends WDLType {

  public final WDLType innerType;

  public ArrayType(final WDLType innerType)  {
    Preconditions.checkNotNull(innerType);
    this.innerType = innerType;
  }

  public String toString() { return String.format("Array[%s]", innerType.toString()); }

  public int hashCode() { return hashAdd("Array".hashCode(), hash(innerType)); }

  public boolean equals(Object o) {
    if(!(o instanceof ArrayType)) { return false; }
    ArrayType t = (ArrayType)o;
    return eq(of(innerType), to(t.innerType));
  }
}
