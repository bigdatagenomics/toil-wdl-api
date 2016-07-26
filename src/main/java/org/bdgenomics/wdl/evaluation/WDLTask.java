package org.bdgenomics.wdl.evaluation;

import static java.util.stream.Collectors.joining;
import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_EMPTY)
public class WDLTask implements WDLComponent<WDLTask> {

  public final String taskName;
  public final List<WDLDeclaration> declarations;
  public final List<Command> commands;
  public final List<Runtime> runtimes;
  public final List<Output> outputs;

  public WDLTask(final String name,
                 final Collection<WDLDeclaration> decls,
                 final Collection<Command> commands,
                 final Collection<Runtime> runtimes,
                 final Collection<Output> outputs) {

    this.taskName = name;
    this.declarations = new ArrayList<>(decls);
    this.commands = new ArrayList<>(commands);
    this.runtimes = new ArrayList<>(runtimes);
    this.outputs = new ArrayList<>(outputs);
  }

  public int hashCode() {
    return hash(taskName, declarations, commands, runtimes, outputs);
  }

  public boolean equals(Object o) {
    if(!(o instanceof WDLTask)) { return false; }
    WDLTask t = (WDLTask)o;
    if(!eq(of(taskName), to(t.taskName))) { return false; }
    if(!eq(of(declarations.toArray()), to(t.declarations.toArray()))) { return false; }
    if(!eq(of(commands.toArray()), to(t.commands.toArray()))) { return false; }
    if(!eq(of(runtimes.toArray()), to(t.runtimes.toArray()))) { return false; }
    if(!eq(of(outputs.toArray()), to(t.outputs.toArray()))) { return false; }
    return true;
  }

  public String toString() {
    try {
      return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
    } catch (JsonProcessingException e) {
      e.printStackTrace(System.err);
      return super.toString();
    }
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
      return new Runtime.Builder().visitRuntime(ctx);
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

      final LinkedList<WDLDeclaration> decls = new LinkedList<>();
      for(WDLParser.DeclarationContext dctx : ctx.declaration()) {
        decls.add(new WDLDeclaration.Builder().visit(dctx));
      }

      TaskComponentBuilder componentBuilder = new TaskComponentBuilder();

      for(WDLParser.Task_sectionContext sectionCtx : ctx.task_section()) {

        Object component = componentBuilder.visit(sectionCtx);

        if(component instanceof Output) { outputs.add((Output)component); }
        if(component instanceof Command) { commands.add((Command)component); }
      }

      return new WDLTask(name, decls, commands, runtimes, outputs);
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

    public int hashCode() {
      return hash(contents);
    }

    public boolean equals(Object o) {
      if(!( o instanceof Command)) { return false; }
      Command c = (Command)o;
      return eq(of(contents), to(c.contents));
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

    public int hashCode() {
      return hash(assignments);
    }

    public boolean equals(Object o) {
      if(!(o instanceof Output)) { return false; }
      Output ot = (Output)o;
      return eq(of(assignments), to(ot.assignments));
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

          final String type = assign_ctx.type().getText();
          final String name = assign_ctx.output_name().getText();
          final WDLExpression value = new WDLExpression.Builder().visit(assign_ctx.expression());

          assignments.add(new OutputAssignment(type, name, value));
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
    public final WDLExpression value;

    public OutputAssignment(String type, String identifier, WDLExpression assignment) {

      Preconditions.checkNotNull(type);
      Preconditions.checkNotNull(identifier);
      Preconditions.checkNotNull(assignment);

      Preconditions.checkArgument(type.length() > 0);
      Preconditions.checkArgument(identifier.length() > 0);

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

  public static class Runtime implements WDLComponent<Runtime> {

    public final List<RuntimeAssignment> assignments;

    public Runtime(final Collection<RuntimeAssignment> assignments) {
      this.assignments = new ArrayList<>(assignments);
    }

    @Override
    public WDLVisitor<Runtime> visitor() {
      return new Builder();
    }

    public static class Builder extends WDLBaseVisitor<Runtime> implements WDLBuilder<Runtime> {
      @Override
      public ParseTree parse(WDLParser parser) {
        return parser.runtime();
      }

      @Override
      public Runtime visitRuntime(WDLParser.RuntimeContext ctx) {
        List<RuntimeAssignment> assignments = new LinkedList<>();
        for(WDLParser.Runtime_assignmentContext assignCtx : ctx.runtime_assignment()) {
          String name = assignCtx.runtime_key().getText();
          WDLExpression exp = new WDLExpression.Builder().visit(assignCtx.expression());
          assignments.add(new RuntimeAssignment(name, exp));
        }
        return new Runtime(assignments);
      }
    }
  }

  public static class RuntimeAssignment {
    public final String identifier;
    public final WDLExpression value;

    public RuntimeAssignment(String identifier, WDLExpression assignment) {
      this.identifier = identifier;
      this.value = assignment;
    }

    public int hashCode() {
      int code = 17;
      code += identifier.hashCode(); code *= 37;
      code += value.hashCode(); code *= 37;
      return code;
    }

    public boolean equals(Object o) {
      if(!(o instanceof OutputAssignment)) { return false; }
      OutputAssignment a = (OutputAssignment)o;
      return identifier.equals(a.identifier) && value.equals(a.value);
    }
  }

}


