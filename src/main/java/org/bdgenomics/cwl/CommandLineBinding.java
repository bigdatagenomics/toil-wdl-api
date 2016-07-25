package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CommandLineBinding {

  public Integer position;
  public String prefix;
  public Boolean separate;
  public String valueFrom;

  public CommandLineBinding() {}

  public CommandLineBinding(Integer position) {
    this.position = position;
  }

  public CommandLineBinding(Integer position, String prefix) {
    this.position = position;
    this.prefix = prefix;
  }

  public CommandLineBinding withPosition(Integer position) {
    this.position = position;
    return this;
  }

  public CommandLineBinding withPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public CommandLineBinding withSeparate(Boolean separate) {
    this.separate = separate;
    return this;
  }

  public CommandLineBinding withValueFrom(String valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }
}
