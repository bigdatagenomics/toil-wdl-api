package org.bdgenomics.wdl.evaluation;

import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

public class WDLWorkflow implements WDLComponent<WDLWorkflow> {
  @Override
  public WDLVisitor<WDLWorkflow> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLWorkflow> implements WDLBuilder<WDLWorkflow> {

    @Override
    public WDLWorkflow visitWorkflow(WDLParser.WorkflowContext ctx) {
      return null;
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.workflow();
    }
  }
}
