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

}
