package org.bdgenomics.cwl;

import java.util.ArrayList;
import java.util.List;
import org.bdgenomics.wdl.evaluation.WDLTask;

public class WDL2CWLConverter {

  public CommandLineTool convertTask(final WDLTask task) {
    WDLTask.Command command = task.commands.get(0);
    String id = task.taskName;

    List<CommandInputParameter> inputs = new ArrayList<>();
    List<CommandOutputParameter> outputs = new ArrayList<>();
    List<CommandLineBinding> commandLineBindings = new ArrayList<>();
    String baseCommand = command.contents[0];

    for(int i = 1; i < command.contents.length; i++) {
      String part = command.contents[i];
      if(part.startsWith("${")) {
        String var = part.substring(2, part.length()-1);


      } else {

      }
    }

    CommandLineTool tool = new CommandLineTool(baseCommand, inputs, outputs, commandLineBindings);

    return tool;
  }
}
