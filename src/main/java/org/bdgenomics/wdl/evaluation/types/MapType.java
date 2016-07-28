package org.bdgenomics.wdl.evaluation.types;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import org.bdgenomics.wdl.evaluation.WDLType;
import com.google.common.base.Preconditions;

public class MapType extends WDLType {

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
