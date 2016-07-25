package org.bdgenomics.cwl;

import java.util.LinkedHashMap;
import java.util.Map;

public class Workflow extends CWLTool {

  public final Map<String, String> inputs;

  public final Map<String, WorkflowOutput> outputs;

  public Workflow(final Map<String, String> inputs, final Map<String, WorkflowOutput> outputs) {
    super("Workflow");
    this.inputs = new LinkedHashMap<>(inputs);
    this.outputs = new LinkedHashMap<>(outputs);
  }

  public static class WorkflowOutput {

    public final String type;
    public final String outputSource;

    public WorkflowOutput(final String type, final String outputSource) {
      this.type = type;
      this.outputSource = outputSource;
    }
  }
}
