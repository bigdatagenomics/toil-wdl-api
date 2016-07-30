package org.bdgenomics.wdl.evaluation.expressions;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprMap extends WDLExpression {

  public final WDLExpression[] keys, values;

  public ExprMap(final Collection<WDLExpression> args) {
    int i = 0;
    keys = new WDLExpression[args.size()/2];
    values = new WDLExpression[keys.length];
    for(WDLExpression e : args) {
      if(i % 2 == 0) {
        keys[i/2] = e;
      } else {
        values[i/2] = e;
      }
      i++;
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for(int i = 0; i < keys.length; i++) {
      sb.append(String.format("%s:%s", keys[i], values[i]));
      if(i < keys.length-1) { sb.append(", "); }
    }
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Object evaluate(Environment env) {
    Map<Object, Object> vals = new TreeMap<>();
    for(int i = 0; i < keys.length; i++) {
      Object key = keys[i].evaluate(env);
      Object value = values[i].evaluate(env);
      vals.put(key, value);
    }
    return vals;
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
    for(WDLExpression arg : keys) {
      arg.findIdentifiers(identifies);
    }
    for(WDLExpression arg : values) {
      arg.findIdentifiers(identifies);
    }
  }
}
