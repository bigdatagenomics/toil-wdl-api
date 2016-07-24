package org.bdgenomics.wdl.evaluation;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Environment {

  private final Optional<Environment> parent;
  private final Map<String, Object> bindings;

  public Environment() {
    this(Optional.empty());
  }

  public Environment(final Optional<Environment> parent) {
    this.parent = parent;
    this.bindings = new TreeMap<>();
  }

  public Environment(final String key, final Object value, final Optional<Environment> parent) {
    this(parent);
    this.bindings.put(key, value);
  }

  public Environment(final Map<String, Object> values, final Optional<Environment> parent) {
    this(parent);
    values.keySet().stream().forEach(key -> bindings.put(key, values.get(key)));
  }

  public <T> T lookup(String key) {
    if(bindings.containsKey(key)) {
      return (T) bindings.get(key);
    } else {
      return parent.map(p -> (T)p.lookup(key)).orElse((T)null);
    }
  }

  public Environment with(String key, Object value) {
    return new Environment(key, value, Optional.of(this));
  }

  public Environment with(Map<String, Object> values) {
    return new Environment(values, Optional.of(this));
  }

}
