package org.bdgenomics.cwl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Preconditions;

@JsonInclude(Include.NON_NULL)
@JsonSerialize(using=CWLPackage.Serializer.class)
public class CWLPackage {

  public final Workflow workflow;
  public final Map<String, CommandLineTool> tools;

  public CWLPackage(Workflow workflow, Map<String, CommandLineTool> tools) {

    Preconditions.checkNotNull(tools);
    Preconditions.checkNotNull(workflow);

    for(String key : tools.keySet()) {
      Preconditions.checkNotNull(tools.get(key));
    }

    this.workflow = workflow;
    this.tools = new LinkedHashMap<>(tools);
  }

  public static class Serializer extends JsonSerializer<CWLPackage> {

    @Override
    public void serialize(CWLPackage cwlPackage, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {

      jsonGenerator.writeObject(cwlPackage.workflow);
      for(CommandLineTool tool : cwlPackage.tools.values()) {
        jsonGenerator.writeObject(tool);
      }
    }
  }

}
