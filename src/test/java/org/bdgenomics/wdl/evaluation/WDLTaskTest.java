package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.*;
import java.io.IOException;
import org.junit.Test;

public class WDLTaskTest {

  @Test
  public void testCommandParsing() throws IOException {
    WDLTask.Command command = WDLEvaluator.parse(new WDLTask.Command.Builder(), "command { }");
    assertThat(command).isNotNull().withFailMessage("command was null");
    assertThat(command.all).isNotNull().withFailMessage("command.all was null");
    assertThat(command.all).isEqualTo("");

    command = WDLEvaluator.parse(new WDLTask.Command.Builder(), "command { ps ${flag} }");
    assertThat(command).isNotNull().withFailMessage("command was null");
    assertThat(command.all).isNotNull().withFailMessage("command.all was null");
    assertThat(command.all).isEqualTo("ps ${flag}");
  }

  @Test
  public void testOutputParsing() throws IOException {
    WDLTask.Output output = WDLEvaluator.parse(new WDLTask.Output.Builder(), "output { }");
    assertThat(output).isNotNull().withFailMessage("output was null");
    assertThat(output.assignments).isEmpty();

    output = WDLEvaluator.parse(new WDLTask.Output.Builder(), "output { File foo = 'bar' }");
    assertThat(output).isNotNull().withFailMessage("output was null");
    assertThat(output.assignments).containsExactly(new WDLTask.OutputAssignment("File", "foo", "'bar'"));

    output = WDLEvaluator.parse(new WDLTask.Output.Builder(), "output { File foo = 'bar'\nString bar = \"grok\"\n }");
    assertThat(output).isNotNull().withFailMessage("output was null");
    assertThat(output.assignments).containsExactly(
      new WDLTask.OutputAssignment("File", "foo", "'bar'"),
      new WDLTask.OutputAssignment("String", "bar", "\"grok\"")
    );
  }
}
