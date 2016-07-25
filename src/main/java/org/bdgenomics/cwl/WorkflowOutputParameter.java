package org.bdgenomics.cwl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
public class WorkflowOutputParameter {

  public final String id;

  public String type;

  public CommandLineBinding inputBinding;

  public String source;

  public WorkflowOutputParameter(final String id) {
    Preconditions.checkNotNull(id);
    this.id = id;
  }

  public WorkflowOutputParameter(final String id, String type, CommandLineBinding binding) {
    this(id);
    this.type = type;
    this.inputBinding = binding;
  }

  public WorkflowOutputParameter withType(final String type) {
    this.type = type;
    return this;
  }

  public WorkflowOutputParameter withInputBinding(final CommandLineBinding binding) {
    this.inputBinding = binding;
    return this;
  }

  public WorkflowOutputParameter withSource(final String source) {
    this.source = source;
    return this;
  }
}
