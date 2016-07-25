package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.BaseTest;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommandLineToolTest extends BaseTest {

  @Test
  public void testEchoCommandSerialization() throws IOException {
    CommandLineTool tool = new CommandLineTool("echo")
      .withInput(new CommandInputParameter("voice", "string", new CommandInputBinding(1)))
      .withOutput(new CommandOutputParameter("output", "File", new CommandOutputBinding("echo_output*.txt")))
      .withStdout("echo_output.txt");

    ObjectMapper mapper = getMapper();

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("echo.cwl"));
  }
}
