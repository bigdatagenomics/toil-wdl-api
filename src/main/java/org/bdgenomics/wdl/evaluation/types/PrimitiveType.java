package org.bdgenomics.wdl.evaluation.types;

import static org.bdgenomics.utils.HashUtils.hash;
import org.bdgenomics.wdl.evaluation.WDLType;
import com.google.common.base.Preconditions;

public abstract class PrimitiveType extends WDLType {

  public final String typeName;

  public PrimitiveType(final String name) {
    Preconditions.checkNotNull(name);
    Preconditions.checkArgument(WDLType.PRIMITIVE_NAMES.contains(name));
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
