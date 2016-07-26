package org.bdgenomics.cwl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bdgenomics.wdl.evaluation.Environment;
import org.bdgenomics.wdl.evaluation.WDLCall;
import org.bdgenomics.wdl.evaluation.WDLExpression;
import org.bdgenomics.wdl.evaluation.WDLTask;
import org.bdgenomics.wdl.evaluation.WDLWorkflow;

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
    String baseCommand = command.contents[0];
    String stdout = null;

    int argIndex = 1;

    for(int i = 1; i < command.contents.length; i++) {
      String part = command.contents[i];
      if(part.startsWith("${")) {
        String var = part.substring(2, part.length() - 1);
        inputs.add(new CommandInputParameter(var, "string", new CommandInputBinding(argIndex++)));

      } else if(part.startsWith(">")) {
        stdout = part.substring(1);

      } else {
        arguments.add(new CommandLineBinding(argIndex++).withValueFrom(part));
      }
    }

    for(WDLTask.Output out : task.outputs) {
      for(WDLTask.OutputAssignment assign : out.assignments) {
        WDLExpression expr = assign.value;
        CommandOutputBinding binding = null;
        if(expr != null) {
          String glob = stripQuotes(expr.evaluate(new Environment()));
          binding = new CommandOutputBinding(glob);
        }
        outputs.add(new CommandOutputParameter(assign.identifier, assign.type, binding));
      }
    }

    CommandLineTool tool = new CommandLineTool(baseCommand, inputs, outputs, arguments).withStdout(stdout);

    return tool;
  }

  public Workflow convertWorkflow(WDLWorkflow wdlWorkflow) {
    Workflow workflow = new Workflow().withId(wdlWorkflow.name);

    WDLCall call = wdlWorkflow.calls().get(0);

    for(WDLCall.CallInput input : call.inputs) {
      workflow = workflow.withInput(new InputParameter(input.key));
    }

    return workflow;
  }

  public static final Pattern singleQuoted = Pattern.compile("'(.*)'");
  public static final Pattern doubleQuoted = Pattern.compile("\"(.*)\"");

  public static String stripQuotes(String input) {
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
}
