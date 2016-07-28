package org.bdgenomics.wdl.evaluation.types;

import static org.bdgenomics.utils.HashUtils.hashAdd;
import org.bdgenomics.wdl.evaluation.WDLType;
import com.google.common.base.Preconditions;

public class OptionalType extends WDLType {

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
