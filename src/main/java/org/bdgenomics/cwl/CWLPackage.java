package org.bdgenomics.cwl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(Include.NON_NULL)
@JsonSerialize(using=CWLPackage.Serializer.class)
public class CWLPackage {

  public final Workflow workflow;
  public final List<CommandLineTool> tools;

  public CWLPackage(Workflow workflow, CommandLineTool ... tools) {
    this.workflow = workflow;
    this.tools = new ArrayList<>(Arrays.asList(tools));
  }

  public static class Serializer extends JsonSerializer<CWLPackage> {

    @Override
    public void serialize(CWLPackage cwlPackage, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {

      jsonGenerator.writeObject(cwlPackage.workflow);
      for(CommandLineTool tool : cwlPackage.tools) {
        jsonGenerator.writeObject(tool);
      }
    }
  }

}
