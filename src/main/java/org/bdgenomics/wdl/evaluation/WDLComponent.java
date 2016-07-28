package org.bdgenomics.wdl.evaluation;

import org.bdgenomics.wdl.parsing.WDLParserVisitor;

public interface WDLComponent<T extends WDLComponent> {

  WDLParserVisitor<T> visitor();
}
