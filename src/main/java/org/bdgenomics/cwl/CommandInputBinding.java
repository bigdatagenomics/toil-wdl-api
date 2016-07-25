package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandInputBinding {

  public Integer position;
  public String prefix;
  public Boolean separate;

  public CommandInputBinding() {}

  public CommandInputBinding(final Integer position) {
    this.position = position;
  }

  public CommandInputBinding(final Integer position, final String prefix, final Boolean separate) {
    this.position = position;
    this.prefix = prefix;
    this.separate = separate;
  }

  public CommandInputBinding withPosition(final Integer position) {
    this.position = position;
    return this;
  }

  public CommandInputBinding withPrefix(final String prefix) {
    this.prefix = prefix;
    return this;
  }

  public CommandInputBinding withSeparate(final Boolean separate) {
    this.separate = separate;
    return this;
  }
}
