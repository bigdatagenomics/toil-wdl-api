package org.bdgenomics.cwl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"cwlVersion", "class", "baseCommand", "stdout", "inputs", "outputs", "arguments"})
public class CommandLineTool extends CWLTool {

  // You'd think: "Why are you using a special serializer here, you could just
  // enable the Jackson option to write single-element collections as solitary values!"
  // But you'd be wrong, because in *other* objects (notably: Workflow) we don't use
  // that convention at all.  So this serializer amounts to turning on this option
  // for _this one particular field_ only.  ARRRGH.
  @JsonSerialize(using=BaseCommandsSerializer.class)

  public final String[] baseCommand;

  @JsonInclude(Include.ALWAYS)
  public List<CommandInputParameter> inputs;

  @JsonInclude(Include.ALWAYS)
  public List<CommandOutputParameter> outputs;

  public List<CommandLineBinding> arguments;

  public String stdout;

  public CommandLineTool(final String baseCommand) {
    this(baseCommand, null, null, null);
  }

  public CommandLineTool(final String baseCommand,
                         final List<CommandInputParameter> inputs,
                         final List<CommandOutputParameter> outputs,
                         final List<CommandLineBinding> arguments) {
    this(new String[] { baseCommand }, inputs, outputs, arguments);
  }

  public CommandLineTool(final String[] baseCommand,
                         final List<CommandInputParameter> inputs,
                         final List<CommandOutputParameter> outputs,
                         final List<CommandLineBinding> arguments) {
    super("CommandLineTool");

    this.baseCommand = baseCommand;
    this.inputs = inputs;
    this.outputs = outputs;
    this.arguments = arguments;
  }

  public CommandLineTool withStdout(final String stdout) {
    this.stdout = stdout;
    return this;
  }

  public CommandLineTool withInput(CommandInputParameter param) {
    if(inputs == null) { inputs = new ArrayList<>(); }
    inputs.add(param);
    return this;
  }

  public CommandLineTool withOutput(CommandOutputParameter param) {
    if(outputs == null) { outputs = new ArrayList<>(); }
    outputs.add(param);
    return this;
  }

  public CommandLineTool withArgument(CommandLineBinding param) {
    if(arguments == null) { arguments = new ArrayList<>(); }
    arguments.add(param);
    return this;
  }

  public static class BaseCommandsSerializer extends JsonSerializer<String[]> {

    @Override
    public void serialize(String[] commands,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
      if(commands == null || commands.length == 0) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeEndArray();
      } else if(commands.length == 1) {
        jsonGenerator.writeString(commands[0]);
      } else {
        jsonGenerator.writeObject(commands);
      }
    }
  }

}
