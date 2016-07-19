package org.bdgenomics.wdl.evaluation;

import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

public interface WDLBuilder<T extends WDLComponent> extends WDLVisitor<T> {

  ParseTree parse(WDLParser parser);
}
