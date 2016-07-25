package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
public class InputParameter {

  public final String id;

  public String type;

  public CommandLineBinding inputBinding;

  public InputParameter(final String id) {
    Preconditions.checkNotNull(id);
    this.id = id;
  }

  public InputParameter(final String id, String type, CommandLineBinding binding) {
    this(id);
    this.type = type;
    this.inputBinding = binding;
  }

  public InputParameter withType(final String type) {
    this.type = type;
    return this;
  }

  public InputParameter withInputBinding(final CommandLineBinding inputBinding) {
    this.inputBinding = inputBinding;
    return this;
  }
}
