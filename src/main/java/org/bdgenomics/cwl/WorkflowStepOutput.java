package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
public class WorkflowStepOutput {

  public final String id;

  public WorkflowStepOutput(final String id) {
    Preconditions.checkNotNull(id);
    this.id = id;
  }
}
