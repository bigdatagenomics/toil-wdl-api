package org.bdgenomics.cwl;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"class", "envDef"})
public class EnvVarRequirement extends Requirement {

  public final List<EnvDef> envDef;

  public EnvVarRequirement(EnvDef... defs) {
    super("EnvVarRequirement");
    envDef = Arrays.asList(defs);
  }

  @JsonPropertyOrder({"envName", "envValue"})
  public static class EnvDef {

    public final String envName, envValue;

    public EnvDef(String envName, String envValue) {
      this.envName = envName;
      this.envValue = envValue;
    }
  }
}
