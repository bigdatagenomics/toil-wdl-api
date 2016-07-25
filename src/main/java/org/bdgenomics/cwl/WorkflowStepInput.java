package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
public class WorkflowStepInput {

  public final String id;

  public String source;

  public String valueFrom;

  public WorkflowStepInput(final String id) {
    Preconditions.checkNotNull(id);
    this.id = id;
    this.source = null;
    this.valueFrom = null;
  }

  public WorkflowStepInput(final String id, final String source) {
    this(id);
    this.source = source;
    this.valueFrom = null;
  }

  public WorkflowStepInput withSource(final String source) {
    this.source = source;
    return this;
  }

  public WorkflowStepInput withValueFrom(final String valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }
}
