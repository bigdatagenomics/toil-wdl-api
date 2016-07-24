package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Output {

  public final String type;
  public final OutputBinding outputBinding;

  public Output(final String type, final OutputBinding outputBinding) {
    this.type = type;
    this.outputBinding = outputBinding;
  }

  @JsonInclude(Include.NON_NULL)
  public static class OutputBinding {

    public final String glob;

    public OutputBinding(final String glob) {
      this.glob = glob;
    }
  }
}
