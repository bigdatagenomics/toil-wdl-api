package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"class", "ramMin"})
public class ResourceRequirement extends Requirement {

  public final Integer ramMin;

  public ResourceRequirement(int ramMin) {
    super("ResourceRequirement");
    this.ramMin = ramMin;
  }
}
