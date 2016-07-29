package org.bdgenomics.wdl.evaluation.expressions;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLExpression;

public class ExprString extends WDLExpression {

  private static final Pattern
    singleQuoted = Pattern.compile("'(.*)'"),
    doubleQuoted = Pattern.compile("\"(.*)\"");

  private String stripQuotes(String value) {
    Matcher m = singleQuoted.matcher(value);
    if(m.matches()) {
      return m.group(1);
    } else if((m = doubleQuoted.matcher(value)).matches()) {
      return m.group(1);
    } else {
      return value;
    }
  }

  public final String value;

  public ExprString(final String value) { this.value = stripQuotes(value); }

  public String toString() { return value; }

  @Override
  public Object evaluate(Environment env) {
    return value;
  }

  @Override
  public void findIdentifiers(List<ExprIdentifier> identifies) {
  }
}
