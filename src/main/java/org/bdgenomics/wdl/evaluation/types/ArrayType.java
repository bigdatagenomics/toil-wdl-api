package org.bdgenomics.wdl.evaluation.types;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import java.util.List;
import org.bdgenomics.wdl.evaluation.WDLType;
import org.bdgenomics.wdl.evaluation.expressions.ExprIdentifier;
import com.google.common.base.Preconditions;

public class ArrayType extends WDLType {

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
