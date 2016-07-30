package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.*;
import static org.bdgenomics.utils.HashUtils.hash;
import static org.bdgenomics.utils.HashUtils.hashAdd;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserVisitor;
import com.google.common.base.Preconditions;

/**
 * A `call NAME { ... }` block inside of a workflow.
 *
 */
public class WDLCall implements WDLComponent<WDLCall> {

  public final String callName;
  public final CallInput[] inputs;

  public WDLCall(final String name) {
    this(name, new CallInput[0]);
  }

  public WDLCall(final String name, final CallInput[] inputs) {
    Preconditions.checkNotNull(name);
    Preconditions.checkNotNull(inputs);
    this.callName = name;
    this.inputs = inputs;
  }

  public int hashCode() {
    return hashAdd(hash(callName), hash(inputs));
  }

  public boolean equals(Object o) {
    if(!(o instanceof WDLCall)) { return false; }
    WDLCall c = (WDLCall)o;
    return
      eq(of(callName), to(c.callName)) &&
      eq(inputs, c.inputs);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(CallInput input : inputs) {
      if(sb.length() > 0) {
        sb.append(", ");
      }
      sb.append(input.toString());
    }
    return String.format("call %s { input: %s }",
      callName,
      sb.toString());
  }

  @Override
  public WDLParserVisitor<WDLCall> visitor() {
    return new Builder();
  }

  public static class CallInput {

    public final String key;
    public final WDLExpression value;

    public CallInput(final String key, final WDLExpression value) {
      Preconditions.checkNotNull(key);
      Preconditions.checkNotNull(value);
      this.key = key;
      this.value = value;
    }

    public int hashCode() { return hash(key, value); }

    public boolean equals(Object o) {
      if(!(o instanceof CallInput)) { return false; }
      CallInput i = (CallInput)o;
      return eq(of(key, value), to(i.key, i.value));
    }

    public String toString() { return String.format("%s=%s", key, value.toString()); }
  }

  public static class Builder extends WDLParserBaseVisitor<WDLCall> implements WDLBuilder<WDLCall> {

    @Override
    public WDLCall visitCall(WDLParser.CallContext ctx) {
      final String callName = ctx.IDENTIFIER(0).getSymbol().getText();
      final CallInput[] inputs = parseInputs(ctx.call_inputs());
      return new WDLCall(callName, inputs);
    }

    private CallInput[] parseInputs(WDLParser.Call_inputsContext ctx) {
      ArrayList<CallInput> inputs = new ArrayList<>();
      if(ctx != null) {
        inputs.addAll(parseMapping(ctx.variable_mappings()));
      }

      return inputs.toArray(new CallInput[inputs.size()]);
    }

    private List<CallInput> parseMapping(WDLParser.Variable_mappingsContext ctx) {
      System.out.println(String.format("Variable_Mappings: \"%s\"", ctx.getText()));

      ArrayList<CallInput> inputs = new ArrayList<>();
      for(WDLParser.Variable_mapping_kvContext kvctx : ctx.variable_mapping_kv()) {
        inputs.add(parseKV(kvctx));
      }
      return inputs;
    }

    private CallInput parseKV(WDLParser.Variable_mapping_kvContext ctx) {
      final String key = ctx.variable_mapping_key().getText();
      final WDLExpression value = new WDLExpression.Builder().visit(ctx.expression());
      return new CallInput(key, value);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.call();
    }
  }
}
