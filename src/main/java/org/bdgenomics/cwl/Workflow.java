package org.bdgenomics.cwl;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"cwlVersion", "class", "inputs", "outputs", "steps"})
public class Workflow extends CWLTool {

  @JsonIgnore
  public String id;

  public List<InputParameter> inputs;

  public List<WorkflowOutputParameter> outputs;

  public List<WorkflowStep> steps;

  public Workflow() {
    this(new ArrayList<InputParameter>(), new ArrayList<WorkflowOutputParameter>(), new ArrayList<WorkflowStep>());
  }

  public Workflow(final List<InputParameter> inputs,
                  final List<WorkflowOutputParameter> outputs,
                  final List<WorkflowStep> steps) {

    super("Workflow");

    Preconditions.checkNotNull(inputs);
    Preconditions.checkNotNull(outputs);
    Preconditions.checkNotNull(steps);
    this.inputs = inputs;
    this.outputs = outputs;
    this.steps = steps;
  }

  public Workflow withId(final String id) {
    this.id = id;
    return this;
  }

  public Workflow withInput(final InputParameter param) {
    this.inputs.add(param);
    return this;
  }

  public Workflow withOutput(final WorkflowOutputParameter param) {
    this.outputs.add(param);
    return this;
  }

  public Workflow withStep(final WorkflowStep step) {
    this.steps.add(step);
    return this;
  }
}
