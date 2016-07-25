package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CommandOutputParameter {

  public final String id;

  public String type;
  public CommandOutputBinding outputBinding;

  public CommandOutputParameter(final String id) {
    this.id = id;
  }

  public CommandOutputParameter(final String id, String type, CommandOutputBinding binding) {
    this.id = id;
    this.type = type;
    this.outputBinding = binding;
  }

  public CommandOutputParameter withType(final String type) {
    this.type = type;
    return this;
  }

  public CommandOutputParameter withBinding(final CommandOutputBinding outputBinding) {
    this.outputBinding = outputBinding;
    return this;
  }
}
