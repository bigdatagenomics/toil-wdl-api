package org.bdgenomics.wdl.evaluation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

public class WDLDocument implements WDLComponent<WDLDocument> {

  public final WDLImport[] imports;
  public final WDLWorkflow workflow;
  public final WDLTask[] tasks;

  public WDLDocument(final Collection<WDLImport> imports,
                     final WDLWorkflow workflow,
                     final Collection<WDLTask> tasks) {

    this.imports = imports.toArray(new WDLImport[imports.size()]);
    this.workflow = workflow;
    this.tasks = tasks.toArray(new WDLTask[tasks.size()]);
  }

  public Map<String, WDLTask> taskMap() {
    Map<String, WDLTask> taskMap = new LinkedHashMap<>();
    for(WDLTask task : tasks) {
      taskMap.put(task.taskName, task);
    }

    return taskMap;
  }

  @Override
  public WDLVisitor<WDLDocument> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLDocument> implements WDLBuilder<WDLDocument> {

    @Override
    public WDLDocument visitDocument(WDLParser.DocumentContext ctx) {
      WDLWorkflow workflow = new WDLWorkflow.Builder().visit(ctx.workflow());
      ArrayList<WDLTask> tasks = new ArrayList<>();
      ArrayList<WDLImport> imports = new ArrayList<>();

      for(WDLParser.WdlimportContext importCtx : ctx.wdlimport()) {
        imports.add(new WDLImport.Builder().visit(importCtx));
      }

      for(WDLParser.TaskContext taskCtx : ctx.task()) {
        tasks.add(new WDLTask.Builder().visit(taskCtx));
      }

      return new WDLDocument(imports, workflow, tasks);
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.document();
    }
  }

}


