package org.bdgenomics.cwl;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.expressions.ExprIdentifier;
import org.bdgenomics.wdl.evaluation.WDLCall;
import org.bdgenomics.wdl.evaluation.WDLDeclaration;
import org.bdgenomics.wdl.evaluation.WDLDocument;
import org.bdgenomics.wdl.evaluation.WDLExpression;
import org.bdgenomics.wdl.evaluation.WDLTask;
import org.bdgenomics.wdl.evaluation.WDLType;
import org.bdgenomics.wdl.evaluation.WDLWorkflow;
import org.bdgenomics.wdl.evaluation.types.FileType;
import com.google.common.base.Preconditions;

/**
 * Converts a WDL document into CWL document(s).
 *
 * <p>
 * WDL-to-CWL conversion is required in order to submit CWL documents to the
 * (CWL-speaking) Toil back-end.  Each WDL document should contain a {@code workflow}
 * block and one or more {@code task} blocks.  Each {@code workflow} block is converted
 * by the transpiler into a CWL {@code Workflow} file, and each {@code task} block is
 * converted into a separate {@code CommandLineTool} block.
 * </p>
 *
 * <p>
 * At the moment, the transpiler cannot convert {@code if}, {@code loop}, or {@code scatter}
 * blocks found in the WDL document.  It also does not support the full range of
 * standard library functions available in WDL.
 * </p>
 */
public class WDLTranspiler {

  private static final Map<String, String> typeConversions;

  static {
    typeConversions = new TreeMap<>();
    typeConversions.put("String", "string");
    typeConversions.put("Boolean", "boolean");
    typeConversions.put("Int", "int");
    typeConversions.put("Float", "double");
    typeConversions.put("File", "File");
  }

  public WDLTranspiler() {
  }

  /**
   * This the type-conversion system, which only works for primitive types at the moment.
   *
   * @param type
   * @return
   */
  public String transpileType(WDLType type) {
    return transpileType(type.toString());
  }

  public String inferType(Object value) {
    if(value instanceof String) {
      return "string";
    } else if(value instanceof Boolean) {
      return "boolean";
    } else if(value instanceof Integer) {
      return "int";
    } else if(value instanceof Double) {
      return "double";
    } else if(value instanceof File) {
      return "File";
    } else {
      throw new IllegalArgumentException(String.format("Unknown primitive value class %s", value.getClass().getSimpleName()));
    }
  }

  /**
   * This is the type-conversion system, which only works for primitive types at the moment.
   *
   * @param type The 'string' representation of a WDL type to be converted into the corresponding
   *             CWL type
   * @return The CWL type (as a string)
   */
  public String transpileType(String type) {
    if(typeConversions.containsKey(type)) {
      return typeConversions.get(type);
    } else {
      throw new IllegalArgumentException(type);
    }
  }

  /**
   * Converts a WDL {@code task} into a CWL {@code CommandLineTool}.
   *
   * @param task A WDL {@code task} block to convert
   * @return A {@code CommandLineTool} value whose command, inputs, and outputs reflect the corresponding
   * command, inputs and outputs of the WDL {@code task}.
   */
  public CommandLineTool convertTask(final WDLTask task) {
    WDLTask.Command command = task.commands.get(0);
    String id = task.taskName;

    List<CommandInputParameter> inputs = new ArrayList<>();
    List<CommandOutputParameter> outputs = new ArrayList<>();
    List<CommandLineBinding> arguments = new ArrayList<>();
    String baseCommand = command.contents[0].trim();
    String stdout = null;

    int argIndex = 1;

    for(int i = 1; i < command.contents.length; i++) {
      String part = command.contents[i];
      if(part.startsWith("${")) {
        String var = part.substring(2, part.length() - 1);
        inputs.add(new CommandInputParameter(var, "string", new CommandInputBinding(argIndex++)));

      } else if(WDLTask.Command.isRedirect(part)) {
        stdout = WDLTask.Command.redirectTarget(part);

      } else if(!part.matches("\\s*")) {
        arguments.add(new CommandLineBinding(argIndex++).withValueFrom(part));
      }
    }

    for(WDLTask.Output out : task.outputs) {
      for(WDLTask.OutputAssignment assign : out.assignments) {
        WDLExpression expr = assign.value;
        CommandOutputBinding binding = null;
        if(expr != null) {
          String glob = stripQuotes(String.valueOf(expr.evaluate(new Environment())));
          binding = new CommandOutputBinding(glob);
        }
        outputs.add(new CommandOutputParameter(assign.identifier, assign.type, binding));
      }
    }

    CommandLineTool tool = new CommandLineTool(baseCommand, inputs, outputs, arguments).withStdout(stdout);

    return tool;
  }

  /**
   * Converts a WDL {@code workflow} into a CWL {@code Workflow}.
   *
   * @param wdlWorkflow The WDL worfkow to convert.
   * @return The compiled CWL Workflow.
   */
  public Workflow convertWorkflow(Map<String, WDLTask> taskMap, WDLWorkflow wdlWorkflow) {
    Workflow workflow = new Workflow().withId(wdlWorkflow.name);

    Map<String, WDLDeclaration> decls = wdlWorkflow.declarationMap();
    Map<String, UniqueOutput> outputMap = outputMap(findUniqueOutputs(taskMap.values()));

    WDLCall call = wdlWorkflow.calls().get(0);
    WDLTask task = taskMap.get(call.callName);

    for(WDLCall.CallInput input : call.inputs) {
      String name = input.key;
      String value = null;
      String link = null;
      String type = null;

      if(input.value instanceof ExprIdentifier) {
        link = ((ExprIdentifier)input.value).value;

        if(!decls.containsKey(link)) {
          throw new IllegalArgumentException(String.format("WDL Workflow didn't contain declaration for \"%s\" (%s)",
            link, decls.keySet().toString()));
        }

        type = transpileType(decls.get(link).type);

      } else {
        Object evaluated = input.value.evaluate(new Environment());
        value = evaluated.toString();
        type = inferType(value);
      }

      if(type.equals("string")) {
        if(task.hasDeclaration(name)) {
          WDLDeclaration decl = task.getDeclaration(name);
          if(decl.type instanceof FileType) {
            type = "File";
          }
        }
      }

      workflow = workflow.withInput(new InputParameter(name, type, null));
    }

    System.out.println(String.format("TASKS: %s", taskMap.values()));
    System.out.println(String.format("UNIQUE_OUTPUTS: %s", findUniqueOutputs(taskMap.values())));
    for(UniqueOutput output : outputMap.values()) {
      workflow = workflow.withOutput(new WorkflowOutputParameter(output.name, output.type, null).withSource(output.toString()));
    }

    workflow = workflow.withStep(convertCall(taskMap, call));

    return workflow;
  }

  /**
   * Converts a WDL {@code call} block, part of a {@code workflow}, into a corresponding
   * CWL {@code WorkflowStep}.
   *
   * @param taskMap The set of all tasks, organized by name.  These are required because the WDL task blocks contain
   *                information that is necessary for filling out the WorkflowStep models in CWL.
   * @param call The particular WDL 'call' block to be transpiled.
   * @return The CWL WorkflowStep, to be embedded within a Workflow, that represents the call blockk.
   */
  public WorkflowStep convertCall(Map<String, WDLTask> taskMap, WDLCall call) {
    if(!taskMap.containsKey(call.callName)) {
      throw new IllegalArgumentException(String.format("Unknown call name %s (tasks: %s)",
        call.callName, taskMap.keySet().toString()));
    }

    WDLTask task = taskMap.get(call.callName);

    Map<String, String> inputAssignments = new LinkedHashMap<>();
    for(WDLCall.CallInput ci : call.inputs) {

      String assignment = ci.value instanceof ExprIdentifier ?
        '#' + ci.value.toString() : String.valueOf(ci.value.evaluate(new Environment()));
      inputAssignments.put(ci.key, assignment);
    }

    ArrayList<WorkflowStepInput> inputs = new ArrayList<>();
    ArrayList<WorkflowStepOutput> outputs = new ArrayList<>();

    for(WDLDeclaration decl : task.declarations) {
      String assignment = inputAssignments.get(decl.identifier);
      inputs.add(new WorkflowStepInput(decl.identifier, assignment));
    }

    for(WDLTask.Output out : task.outputs) {
      for(WDLTask.OutputAssignment assign : out.assignments) {
        outputs.add(new WorkflowStepOutput(assign.identifier));
      }
    }

    return new WorkflowStep(call.callName, task.taskName + ".cwl", inputs, outputs);
  }

  /**
   * Converts a WDL {@code document} into a collection of CWL components.
   *
   * This is a little tricky -- WDL doesn't really have a top-level object, and its grammar for
   * a document is simply:
   * <pre>
   *   $document = ( $import | $workflow | $task )+
   * </pre>
   *
   * (Even this is a little confusing, since what are we supposed to do if multiple workflows occur
   * within the same document?)
   *
   * At any rate, we use the CWLPackage class, to represent the collection of components in CWL
   * that correspond to one of these WDL documents.  One additional wrinkle here is that the individual
   * CWL CommandLineTool components will be serialized out into separate files usually, whereas the
   * WDL tasks are usually bundled alongside their workflow.
   *
   * @param wdlDocument The WDL document to transpile
   * @return The collection of CWL components that are converted from the document.
   */
  public CWLPackage convertDocument(WDLDocument wdlDocument) {

    Map<String, CommandLineTool> toolMap = new LinkedHashMap<>();
    for(WDLTask task : wdlDocument.tasks) {
      toolMap.put(task.taskName + ".cwl", convertTask(task));
    }

    Workflow workflow = convertWorkflow(wdlDocument.taskMap(), wdlDocument.workflow);

    return new CWLPackage(workflow, toolMap);
  }

  private static final Pattern singleQuoted = Pattern.compile("'(.*)'");
  private static final Pattern doubleQuoted = Pattern.compile("\"(.*)\"");

  private static String stripQuotes(String input) {
    Matcher singleq = singleQuoted.matcher(input);
    Matcher doubleq = doubleQuoted.matcher(input);
    if(singleq.matches()) {
      return singleq.group(1);
    } else if(doubleq.matches()) {
      return doubleq.group(1);
    } else {
      return input;
    }
  }

  private List<MappedInput> findMappedInputs(WDLWorkflow workflow) {
    ArrayList<MappedInput> inputs = new ArrayList<>();
    for(WDLCall call : workflow.calls()) {
      for(WDLCall.CallInput input : call.inputs) {
        inputs.add(new MappedInput(call.callName, input.key, input.value.toString()));
      }
    }

    return inputs;
  }

  private List<UniqueOutput> findUniqueOutputs(Collection<WDLTask> tasks) {
    ArrayList<UniqueOutput> outputs = new ArrayList<>();
    System.out.println("Finding unique outputs...");
    for(WDLTask task : tasks) {
      System.out.println(String.format("\tFinding outputs for task %s", task.taskName));
      for(WDLTask.Output outputBlock : task.outputs) {
        System.out.println(String.format("\t\tOutput block"));
        for(WDLTask.OutputAssignment assignment : outputBlock.assignments) {
          System.out.println(String.format("\t\t\tFinding unique outputs for assignment %s/%s", assignment.identifier, assignment.type));
          outputs.add(new UniqueOutput(task.taskName, assignment.identifier, assignment.type));
        }
      }
    }

    return outputs;
  }

  private Map<String, UniqueOutput> outputMap(Collection<UniqueOutput> outputs) {
    LinkedHashMap<String, UniqueOutput> map = new LinkedHashMap<>();
    for(UniqueOutput out : outputs) {
      map.put(out.name, out);
    }
    return map;
  }

  /**
   * Represents an output from one of the tasks in the WDL document, and
   * therefore an output to the workflow itself.
   */
  private static class UniqueOutput {

    public final String step;
    public final String name;
    public final String type;

    public UniqueOutput(final String step, final String name, final String type) {
      this.step = step;
      this.name = name;
      this.type = type;

      Preconditions.checkNotNull(name);
    }

    public String toString() {
      return step == null ?
        String.format("#%s", name) : String.format("#%s/%s", step, name);
    }

    public int hashCode() { return hash(step, name); }

    public boolean equals(Object o) {
      if(!(o instanceof UniqueOutput)) { return false; }

      UniqueOutput u = (UniqueOutput)o;
      return eq(of(step, name), to(u.step, u.name));
    }
  }

  private static class MappedInput {

    public final String call;
    public final String input;
    public final String value;

    public MappedInput(final String call, final String input, final String value) {

      Preconditions.checkNotNull(call);
      Preconditions.checkNotNull(input);
      Preconditions.checkNotNull(value);

      this.call = call;
      this.input = input;
      this.value = value;
    }

    public int hashCode() {
      return hash(call, input, value);
    }

    public boolean equals(Object o) {
      if (!(o instanceof MappedInput)) {
        return false;
      }
      MappedInput m = (MappedInput) o;
      return eq(of(call, input, value), to(m.call, m.input, m.value));
    }

    public String toString() {
      return String.format("%s/%s=%s", call, input, value);
    }

  }
}
