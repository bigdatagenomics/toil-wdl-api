package org.bdgenomics.wdl.evaluation;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import org.bdgenomics.wdl.evaluation.types.TopType;

public class Environment {

  private final Optional<Environment> parent;

  private final Map<String, Object> bindings;
  private final Map<String, WDLType> types;

  public Environment() {
    this(Optional.empty());
  }

  public Environment(final Optional<Environment> parent) {
    this.parent = parent;
    this.bindings = new TreeMap<>();
    this.types = new TreeMap<>();
  }

  public Environment(final String key, final Object value, WDLType type, final Optional<Environment> parent) {
    this(parent);
    this.bindings.put(key, value);
    this.types.put(key, type);
  }

  public Environment(final Map<String, Object> values,
                     final Map<String, WDLType> types,
                     final Optional<Environment> parent) {
    this(parent);
    values.keySet().stream().forEach(key -> this.bindings.put(key, values.get(key)));
    types.keySet().stream().forEach(key -> this.types.put(key, types.get(key)));
  }

  public WDLType type(String key) {
    if(types.containsKey(key)) {
      return types.get(key);
    } else {
      return parent.map(p -> p.type(key)).orElse(WDLType.TOP);
    }
  }

  public <T> T lookup(String key) {
    if(bindings.containsKey(key)) {
      return (T) bindings.get(key);
    } else {
      return parent.map(p -> (T)p.lookup(key)).orElse((T)null);
    }
  }

  public Environment with(String key, Object value, WDLType type) {
    return new Environment(key, value, type, Optional.of(this));
  }

  public Environment with(Map<String, Object> values, Map<String, WDLType> types) {
    return new Environment(values, types, Optional.of(this));
  }

}
