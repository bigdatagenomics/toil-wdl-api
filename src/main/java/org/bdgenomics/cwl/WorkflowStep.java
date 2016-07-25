package org.bdgenomics.cwl;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.Preconditions;

@JsonPropertyOrder({"id", "run", "inputs", "outputs" })
@JsonInclude(Include.NON_NULL)
public class WorkflowStep {

  public final String id;
  public final List<WorkflowStepInput> inputs;
  public final List<WorkflowStepOutput> outputs;
  public final String run;

  public List<String> requirements;

  public WorkflowStep(final String id,
              final String run,
              final List<WorkflowStepInput> inputs,
              final List<WorkflowStepOutput> outputs) {

    Preconditions.checkNotNull(id);
    Preconditions.checkNotNull(run);
    Preconditions.checkNotNull(inputs);
    Preconditions.checkNotNull(outputs);

    this.id = id;
    this.run = run;
    this.inputs = inputs;
    this.outputs = outputs;
    this.requirements = null;
  }

  public WorkflowStep(String id, String run) {
    this(id, run, new ArrayList<>(), new ArrayList<>());
  }

  public WorkflowStep withRequirements(String... reqs) {
    if(requirements == null) { requirements = new ArrayList<>(); }
    for(String req : reqs) {
      requirements.add(req);
    }
    return this;
  }
}
