package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.*;
import java.io.IOException;
import java.util.Optional;
import org.bdgenomics.BaseTest;
import org.junit.Test;

public class WDLTaskTest extends BaseTest {

  @Test
  public void testEchoWDLParsing() throws IOException {
    String echoWDLString = fixture("echo.wdl");
    WDLTask task = WDLEvaluator.parse(new WDLTask.Builder(), echoWDLString);

    WDLTask target = new WDLTask("echo",
      list(new WDLDeclaration(WDLType.STRING, "voice", Optional.empty())),
      list(new WDLTask.Command("echo", "${voice}", ">echo_output.txt")),
      list(),
      list(new WDLTask.Output(new WDLTask.OutputAssignment("File", "output", expression("\"echo_output.txt\""))))
    );

    assertThat(task).isEqualTo(target);
  }

  @Test
  public void testTaskParsing() throws IOException {
    WDLTask task = WDLEvaluator.parse(new WDLTask.Builder(), "task foo { }");
    assertThat(task).isNotNull().withFailMessage("task was null");
    assertThat(task.taskName).isEqualTo("foo");
    assertThat(task.commands).isEmpty();
    assertThat(task.outputs).isEmpty();

    task = WDLEvaluator.parse(new WDLTask.Builder(), "task foo { File in }");
    assertThat(task).isNotNull().withFailMessage("task was null");
    assertThat(task.taskName).isEqualTo("foo");
    assertThat(task.commands).isEmpty();
    assertThat(task.outputs).isEmpty();
    assertThat(task.declarations).containsExactly(new WDLDeclaration(
      new PrimitiveType("File"), "in", Optional.empty()));

    task = WDLEvaluator.parse(new WDLTask.Builder(), "task foo { output { String temp = \"x\"} }");
    assertThat(task).isNotNull().withFailMessage("task was null");
    assertThat(task.taskName).isEqualTo("foo");
    assertThat(task.commands).isEmpty();
    assertThat(task.outputs).hasAtLeastOneElementOfType(WDLTask.Output.class);
    assertThat(task.outputs.get(0).assignments).containsExactly(new WDLTask.OutputAssignment("String", "temp", expression("\"x\"")));
  }

  @Test
  public void testRuntimeParsing() throws IOException {
    WDLTask.Runtime runtime = WDLEvaluator.parse(new WDLTask.Runtime.Builder(), "runtime { }");
    assertThat(runtime).isNotNull().withFailMessage("runtime was null");
  }

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
    assertThat(output.assignments).containsExactly(new WDLTask.OutputAssignment("File", "foo", expression("'bar'")));

    output = WDLEvaluator.parse(new WDLTask.Output.Builder(), "output { File foo = 'bar'\nString bar = \"grok\"\n }");
    assertThat(output).isNotNull().withFailMessage("output was null");
    assertThat(output.assignments).containsExactly(
      new WDLTask.OutputAssignment("File", "foo", expression("'bar'")),
      new WDLTask.OutputAssignment("String", "bar", expression("\"grok\""))
    );
  }

  public static WDLExpression expression(String exprValue) throws IOException {
    return WDLEvaluator.parse(new WDLExpression.Builder(), exprValue);
  }
}
