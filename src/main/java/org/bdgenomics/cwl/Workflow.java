package org.bdgenomics.cwl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 cwlVersion: v1.0
 class: Workflow
 inputs:
   inp: File
   ex: string

 outputs:
   classout:
     type: File
     outputSource: compile/classfile

 steps:
   untar:
     run: tar-param.cwl
     in:
       tarfile: inp
       extractfile: ex
     out: [example_out]

   compile:
     run: arguments.cwl
     in:
       src: untar/example_out
     out: [classfile]
 */
@JsonPropertyOrder({"cwlVersion", "class", "inputs", "outputs", "steps"})
public class Workflow extends CWLTool {

  public final Map<String, String> inputs;

  public final Map<String, WorkflowOutput> outputs;

  public final Map<String, Step> steps;

  public Workflow(final Map<String, String> inputs,
                  final Map<String, WorkflowOutput> outputs,
                  final Map<String, Step> steps) {
    super("Workflow");
    this.inputs = new LinkedHashMap<>(inputs);
    this.outputs = new LinkedHashMap<>(outputs);
    this.steps = new LinkedHashMap<>(steps);
  }

  public static class WorkflowOutput {

    public final String type;

    public final String outputSource;

    public WorkflowOutput(final String type, final String outputSource) {
      this.type = type;
      this.outputSource = outputSource;
    }
  }

  /**
   untar:
     run: tar-param.cwl
     in:
       tarfile: inp
       extractfile: ex
     outputs: [example_out]
   */
  public static class Step {

    public final String run;

    public final Map<String, String> in;

    public final List<String> out;

    public Step(final String run, final Map<String, String> in, final List<String> out) {
      this.run = run;
      this.in = new LinkedHashMap<>(in);
      this.out = new ArrayList<>(out);
    }
  }
}
