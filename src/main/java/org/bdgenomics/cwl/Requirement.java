package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Requirement {

  @JsonProperty("class")
  public final String _class;

  public Requirement(String _class) {
    this._class = _class;
  }
}
