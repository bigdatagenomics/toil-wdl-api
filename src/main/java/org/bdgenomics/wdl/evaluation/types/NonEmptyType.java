package org.bdgenomics.wdl.evaluation.types;

import static org.bdgenomics.utils.HashUtils.hashAdd;
import org.bdgenomics.wdl.evaluation.WDLType;
import com.google.common.base.Preconditions;

public class NonEmptyType extends WDLType {

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
