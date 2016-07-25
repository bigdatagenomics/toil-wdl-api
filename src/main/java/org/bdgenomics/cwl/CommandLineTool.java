package org.bdgenomics.cwl;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({"cwlVersion", "class", "baseCommand", "inputs", "outputs"})
public class CommandLineTool extends CWLTool {

  // You'd think: "Why are you using a special serializer here, you could just
  // enable the Jackson option to write single-element collections as solitary values!"
  // But you'd be wrong, because in *other* objects (notably: Workflow) we don't use
  // that convention at all.  So this serializer amounts to turning on this option
  // for _this one particular field_ only.  ARRRGH.
  @JsonSerialize(using=BaseCommandsSerializer.class)
  public final String[] baseCommand;

  // Gotta use a custom serializer because, while this is an object (and when it is non-empty, it is
  // serialized as an object in YAML), when it is empty, it is serialized as an empty array.
  @JsonSerialize(using=InputsSerializer.class)
  public final Map<String, Input> inputs;

  // See the comment for _inputs_, above.
  @JsonSerialize(using=OutputsSerializer.class)
  public final Map<String, Output> outputs;

  public CommandLineTool(final String baseCommand,
                         final Map<String, Input> inputs,
                         final Map<String, Output> outputs) {
    this(new String[] { baseCommand }, inputs, outputs);
  }

  public CommandLineTool(final String[] baseCommand,
                         final Map<String, Input> inputs,
                         final Map<String, Output> outputs) {

    super("CommandLineTool");

    this.baseCommand = baseCommand;
    this.inputs = new LinkedHashMap<>(inputs);
    this.outputs = new LinkedHashMap<>(outputs);
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

  public static class InputsSerializer extends JsonSerializer<Map<String, Input>> {

    @Override
    public void serialize(Map<String, Input> stringOutputMap,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
      if(stringOutputMap.isEmpty()) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeEndArray();
      } else {
        jsonGenerator.writeObject(stringOutputMap);
      }
    }
  }

  public static class OutputsSerializer extends JsonSerializer<Map<String, Output>> {

    @Override
    public void serialize(Map<String, Output> stringOutputMap,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
      if(stringOutputMap.isEmpty()) {
        jsonGenerator.writeStartArray();
        jsonGenerator.writeEndArray();
      } else {
        jsonGenerator.writeObject(stringOutputMap);
      }
    }
  }
}
