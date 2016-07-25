package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CWLTool extends CWLComponent {

  @JsonProperty("class")
  public final String _class;

  public CWLTool(final String _class) {
    this._class = _class;
  }
}
