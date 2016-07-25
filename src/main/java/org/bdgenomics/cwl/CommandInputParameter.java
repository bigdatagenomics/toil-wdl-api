package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandInputParameter {

  public final String id;

  public String type;

  public CommandInputBinding inputBinding;

  @JsonProperty("default")
  public String _default;

  public CommandInputParameter(final String id) {
    this.id = id;
  }

  public CommandInputParameter(final String id, String type, CommandInputBinding inputBinding) {
    this(id);
    this.type = type;
    this.inputBinding = inputBinding;
  }

  public CommandInputParameter withDefault(final String _default) {
    this._default = _default;
    return this;
  }

  public CommandInputParameter withInputBinding(final CommandInputBinding binding) {
    this.inputBinding = binding;
    return this;
  }

  public CommandInputParameter withType(final String type) {
    this.type = type;
    return this;
  }


}
