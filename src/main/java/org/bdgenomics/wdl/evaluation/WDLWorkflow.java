package org.bdgenomics.wdl.evaluation;

import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;
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
    return Stream.of(workflowSteps).filter(i -> i instanceof WDLDeclaration).map(i -> (WDLDeclaration)i).collect(toList());
  }

  public List<WDLCall> calls() {
    return Stream.of(workflowSteps).filter(i -> i instanceof WDLCall).map(i -> (WDLCall) i).collect(toList());
  }

  @Override
  public WDLVisitor<WDLWorkflow> visitor() {
    return new Builder();
  }

  private static class WorkflowElementBuilder extends WDLBaseVisitor<WDLComponent> implements WDLBuilder<WDLComponent> {

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

  public static class Builder extends WDLBaseVisitor<WDLWorkflow> implements WDLBuilder<WDLWorkflow> {

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
