package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandOutputBinding {

  public String glob;
  public Boolean loadContents;
  public String outputEval;

  public CommandOutputBinding() {
  }

  public CommandOutputBinding(String glob) {
    this.glob = glob;
  }

  public CommandOutputBinding withGlob(final String glob) {
    this.glob = glob;
    return this;
  }
}
