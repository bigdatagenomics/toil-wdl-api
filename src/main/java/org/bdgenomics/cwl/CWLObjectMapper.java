package org.bdgenomics.cwl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

public class CWLObjectMapper extends ObjectMapper {

  public CWLObjectMapper() {
    super(new CWLYAMLFactory());
    //enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    disable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
  }
}

class CWLYAMLFactory extends YAMLFactory {

  public CWLYAMLFactory() {
    this.configure(YAMLGenerator.Feature.WRITE_DOC_START_MARKER, false);
    this.configure(YAMLGenerator.Feature.MINIMIZE_QUOTES, true);
    this.configure(YAMLGenerator.Feature.SPLIT_LINES, false);
  }
}
