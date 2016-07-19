package org.bdgenomics.wdl.evaluation;

import static java.util.stream.Collectors.joining;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WDLTask {

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


