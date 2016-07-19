package org.bdgenomics.wdl.evaluation;

import static java.util.stream.Collectors.joining;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WDLTask implements WDLComponent<WDLTask> {

  public final String taskName;
  public final List<Command> commands;
  public final List<Runtime> runtimes;
  public final List<Output> outputs;

  public WDLTask(final String name,
                 final Collection<Command> commands,
                 final Collection<Runtime> runtimes,
                 final Collection<Output> outputs) {

    this.taskName = name;
    this.commands = new ArrayList<>(commands);
    this.runtimes = new ArrayList<>(runtimes);
    this.outputs = new ArrayList<>(outputs);
  }

  @Override
  public WDLVisitor<WDLTask> visitor() {
    return new Builder();
  }

  private static class TaskComponentBuilder extends WDLBaseVisitor<Object> {

    @Override
    public Object visitCommand(WDLParser.CommandContext ctx) {
      return new Command.Builder().visitCommand(ctx);
    }
    @Override
    public Object visitRuntime(WDLParser.RuntimeContext ctx) {
      return null;
    }
    @Override
    public Object visitTask_output(WDLParser.Task_outputContext ctx) {
      return new Output.Builder().visitTask_output(ctx);
    }
  }

  public static class Builder extends WDLBaseVisitor<WDLTask> implements WDLBuilder<WDLTask> {

    @Override
    public WDLTask visitTask(WDLParser.TaskContext ctx) {
      final String name = ctx.task_name().getText();
      final LinkedList<Output> outputs = new LinkedList<>();
      final LinkedList<Command> commands = new LinkedList<>();
      final LinkedList<Runtime> runtimes = new LinkedList<>();

      TaskComponentBuilder componentBuilder = new TaskComponentBuilder();

      for(WDLParser.Task_sectionContext sectionCtx : ctx.task_section()) {

        Object component = componentBuilder.visit(sectionCtx);

        if(component instanceof Output) { outputs.add((Output)component); }
        if(component instanceof Command) { commands.add((Command)component); }
      }

      return new WDLTask(name, commands, runtimes, outputs);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.task();
    }
  }

  public static class Command implements WDLComponent<Command> {

    public static final Logger LOG = LoggerFactory.getLogger(Command.class);

    public final String[] contents;
    public final String all;

    public Command(String... parts) {
      this.contents = parts.clone();
      this.all = Stream.of(this.contents).collect(joining(" "));
    }

    @Override
    public WDLVisitor<Command> visitor() {
      return new Builder();
    }

    public static class Builder extends WDLBaseVisitor<Command> implements WDLBuilder<Command> {

      @Override
      public Command visitCommand(WDLParser.CommandContext ctx) {
        ArrayList<String> parts = new ArrayList<>();
        for(WDLParser.Command_partContext part_ctx : ctx.command_part()) {
          parts.add(part_ctx.getText());
        }
        return new Command(parts.toArray(new String[parts.size()]));
      }

      @Override
      public ParseTree parse(WDLParser parser) {
        return parser.command();
      }
    };

  }

  public static class Output implements WDLComponent<Output> {

    public final OutputAssignment[] assignments;

    public Output(OutputAssignment... assignments) {
      this.assignments = assignments.clone();
    }

    @Override
    public WDLVisitor<Output> visitor() {
      return new Builder();
    }

    public static class Builder extends WDLBaseVisitor<Output> implements WDLBuilder<Output> {

      @Override
      public Output visitTask_output(WDLParser.Task_outputContext ctx) {
        ArrayList<OutputAssignment> assignments = new ArrayList<>();

        for(WDLParser.Output_assignmentContext assign_ctx : ctx.output_assignment()) {

          assignments.add(new OutputAssignment(
            assign_ctx.type().getText(),
            assign_ctx.output_name().getText(),
            assign_ctx.output_value().getText()
            ));
        }
        return new Output(assignments.toArray(new OutputAssignment[assignments.size()]));
      }

      @Override
      public ParseTree parse(WDLParser parser) {
        return parser.task_output();
      }
    }
  }

  public static class OutputAssignment {
    public final String type;
    public final String identifier;
    public final String value;

    public OutputAssignment(String type, String identifier, String assignment) {
      this.type = type;
      this.identifier = identifier;
      this.value = assignment;
    }

    public int hashCode() {
      int code = 17;
      code += type.hashCode(); code *= 37;
      code += identifier.hashCode(); code *= 37;
      code += value.hashCode(); code *= 37;
      return code;
    }

    public boolean equals(Object o) {
      if(!(o instanceof OutputAssignment)) { return false; }
      OutputAssignment a = (OutputAssignment)o;
      return type.equals(a.type) && identifier.equals(a.identifier) && value.equals(a.value);
    }
  }

  public static class Runtime {

  }

}


