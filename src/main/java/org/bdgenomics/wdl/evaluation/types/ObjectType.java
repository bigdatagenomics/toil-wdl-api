package org.bdgenomics.wdl.evaluation.types;

import org.bdgenomics.wdl.evaluation.WDLType;

public class ObjectType extends WDLType {

  public ObjectType() {
  }

  public int hashCode() { return "Object".hashCode(); }

  public boolean equals(Object o) {
    return o instanceof ObjectType;
  }

  public String toString() { return "Object"; }
}
