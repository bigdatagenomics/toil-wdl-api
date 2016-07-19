package org.bdgenomics.wdl.evaluation;

import org.bdgenomics.wdl.parsing.WDLVisitor;

public interface WDLComponent<T extends WDLComponent> {

  WDLVisitor<T> visitor();
}
