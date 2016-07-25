package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.util.Arrays;
import org.bdgenomics.BaseTest;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WorkflowTest extends BaseTest {

  /*
  cwlVersion: v1.0
class: Workflow
inputs:
  inp: File
  ex: string

outputs:
  classout:
    type: File
    outputSource: compile/classfile

steps:
  untar:
    run: tar-param.cwl
    in:
      tarfile: inp
      extractfile: ex
    out: [example_out]

  compile:
    run: arguments.cwl
    in:
      src: untar/example_out
    out: [classfile]
   */
  @Test
  public void testWorkflowSerializationTest1() throws IOException {
    Workflow workflow = new Workflow(
      // inputs
      map(v("inp", "ex"), v("File", "string")),
      // outputs
      map(v("classout"), v(new Workflow.WorkflowOutput("File", "compile/classfile"))),
      // steps
      map(v("untar", "compile"), v(
        new Workflow.Step("tar-param.cwl",
          map(v("tarfile", "extractfile"), v("inp", "ex")),
          list("example_out")),
        new Workflow.Step("arguments.cwl",
          map(v("src"), v("untar/example_out")),
          list("classfile")))));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(workflow);

    String fixture = fixture("cwl_workflow_test1.yml");

    assertThat(yaml).isEqualTo(fixture);
  }

}
