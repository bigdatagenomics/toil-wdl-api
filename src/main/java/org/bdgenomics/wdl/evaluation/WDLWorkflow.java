package org.bdgenomics.wdl.evaluation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserVisitor;
import com.google.common.base.Preconditions;

public class WDLWorkflow implements WDLComponent<WDLWorkflow> {

  public final String name;
  public WDLComponent[] workflowSteps;

  public WDLWorkflow(final String name, final Collection<WDLComponent> steps)  {
    Preconditions.checkNotNull(name);
    this.name = name;
    this.workflowSteps = steps.toArray(new WDLComponent[steps.size()]);
  }

  public Map<String, WDLDeclaration> declarationMap() {
    LinkedHashMap<String, WDLDeclaration> decls = new LinkedHashMap<>();
    for(WDLDeclaration decl : declarations()) {
      decls.put(decl.identifier, decl);
    }
    return decls;
  }

  public List<WDLDeclaration> declarations() {
    ArrayList<WDLDeclaration> filtered = new ArrayList<>();
    for(WDLComponent comp : workflowSteps) {
      if(comp instanceof WDLDeclaration) {
        filtered.add((WDLDeclaration)comp);
      }
    }
    return filtered;
  }

  public List<WDLCall> calls() {
    ArrayList<WDLCall> filtered = new ArrayList<>();
    for(WDLComponent comp : workflowSteps) {
      if(comp instanceof WDLCall) {
        filtered.add((WDLCall)comp);
      }
    }
    return filtered;
  }

  @Override
  public WDLParserVisitor<WDLWorkflow> visitor() {
    return new Builder();
  }

  private static class WorkflowElementBuilder extends WDLParserBaseVisitor<WDLComponent> implements WDLBuilder<WDLComponent> {

    @Override
    public WDLComponent visitCall(WDLParser.CallContext ctx) {
      return new WDLCall.Builder().visit(ctx);
    }

    @Override
    public WDLComponent visitDeclaration(WDLParser.DeclarationContext ctx) {
      return new WDLDeclaration.Builder().visit(ctx);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.workflow_element();
    }
  }

  public static class Builder extends WDLParserBaseVisitor<WDLWorkflow> implements WDLBuilder<WDLWorkflow> {

    @Override
    public WDLWorkflow visitWorkflow(WDLParser.WorkflowContext ctx) {
      final String name = ctx.workflow_name().getText();
      WorkflowElementBuilder elementBuilder = new WorkflowElementBuilder();
      final ArrayList<WDLComponent> components = new ArrayList<>();

      for(WDLParser.Workflow_elementContext elmtCtx : ctx.workflow_element()) {
        components.add(elementBuilder.visit(elmtCtx));
      }

      return new WDLWorkflow(name, components);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.workflow();
    }
  }
}
