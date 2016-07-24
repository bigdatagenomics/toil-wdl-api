package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Input {
  public final String type;
  public final InputBinding inputBinding;

  public Input(final String type, final InputBinding binding) {
    this.type = type;
    this.inputBinding = binding;
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  public static class InputBinding {

    public final Integer position;
    public final String prefix;
    public final Boolean separate;

    public InputBinding(final Integer position, final String prefix) {
      this(position, prefix, null);
    }

    public InputBinding(final Integer position, final String prefix, final Boolean separate) {
      this.position = position;
      this.prefix = prefix;
      this.separate = separate;
    }
  }
}
