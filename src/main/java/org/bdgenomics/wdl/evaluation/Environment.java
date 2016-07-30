package org.bdgenomics.wdl.evaluation;

import java.util.Map;
import java.util.TreeMap;
import org.bdgenomics.wdl.evaluation.types.TopType;

public class Environment {

  private final Environment parent;

  private final Map<String, Object> bindings;
  private final Map<String, WDLType> types;

  public Environment() {
    this(null);
  }

  public Environment(final Environment parent) {
    this.parent = parent;
    this.bindings = new TreeMap<>();
    this.types = new TreeMap<>();
  }

  public Environment(final String key, final Object value, WDLType type, final Environment parent) {
    this(parent);
    this.bindings.put(key, value);
    this.types.put(key, type);
  }

  public Environment(final Map<String, Object> values,
                     final Map<String, WDLType> types,
                     final Environment parent) {
    this(parent);
    this.bindings.putAll(values);
    this.types.putAll(types);
  }

  public WDLType type(String key) {
    if(types.containsKey(key)) {
      return types.get(key);
    } else {
      if(parent != null) {
        return parent.type(key);
      } else {
        return WDLType.TOP;
      }
    }
  }

  public <T> T lookup(String key) {
    if(bindings.containsKey(key)) {
      return (T) bindings.get(key);
    } else {
      if(parent != null) {
        return (T)parent.lookup(key);
      } else {
        return (T)null;
      }
    }
  }

  public Environment with(String key, Object value, WDLType type) {
    return new Environment(key, value, type, this);
  }

  public Environment with(Map<String, Object> values, Map<String, WDLType> types) {
    return new Environment(values, types, this);
  }

}
