package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.BaseTest;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandLineToolTest extends BaseTest {

  @Test
  public void testSimpleCommandLineToolSerialization() throws IOException {
    CommandLineTool tool = new CommandLineTool(
      "echo",
      map(
        v("example_flag"),
        v(new Input("boolean", new Input.InputBinding(1, "-f")))),
      map(new String[0], new Output[0]));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("cwl_commandlinetool_test1.yml"));
  }

  @Test
  public void testCommandLineToolSerializationWithNonemptyOutput() throws IOException {
    CommandLineTool tool = new CommandLineTool(
      "echo",
      map(
        v("example_flag"),
        v(new Input("boolean", new Input.InputBinding(1, "-f")))),
      map(
        v("example_output"),
        v(new Output("File", new Output.OutputBinding("hello.txt")))));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("cwl_commandlinetool_test2.yml"));
  }

  @Test
  public void testCommandWithMultipleBaseArgs() throws IOException {
    CommandLineTool tool = new CommandLineTool(
      new String[]{"tar", "xf"},
      map(
        v("example_flag"),
        v(new Input("boolean", new Input.InputBinding(1, "-f")))),
      map(new String[0], new Output[0]));

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("cwl_commandlinetool_test3.yml"));
  }

}
