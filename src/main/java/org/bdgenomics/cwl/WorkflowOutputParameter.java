package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
public class WorkflowOutputParameter {

  public final String id;

  public String type;

  public CommandOutputBinding outputBinding;

  public String source;

  public WorkflowOutputParameter(final String id) {
    Preconditions.checkNotNull(id);
    this.id = id;
  }

  public WorkflowOutputParameter(final String id, String type, CommandOutputBinding binding) {
    this(id);
    this.type = type;
    this.outputBinding = binding;
  }

  public WorkflowOutputParameter withType(final String type) {
    this.type = type;
    return this;
  }

  public WorkflowOutputParameter withOutputBinding(final CommandOutputBinding binding) {
    this.outputBinding = binding;
    return this;
  }

  public WorkflowOutputParameter withSource(final String source) {
    this.source = source;
    return this;
  }
}
