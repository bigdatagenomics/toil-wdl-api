package org.bdgenomics.cwl;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.ALWAYS)
public class CommandLineTool {

  public final String baseCommand;

  @JsonSerialize(using=InputsSerializer.class)
  public final Map<String, Input> inputs;

  @JsonSerialize(using=OutputsSerializer.class)
  public final Map<String, Output> outputs;

  public CommandLineTool(final String baseCommand,
                         final Map<String, Input> inputs,
                         final Map<String, Output> outputs) {

    this.baseCommand = baseCommand;
    this.inputs = new LinkedHashMap<>(inputs);
    this.outputs = new LinkedHashMap<>(outputs);
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
