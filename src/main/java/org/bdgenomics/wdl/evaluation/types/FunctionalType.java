package org.bdgenomics.wdl.evaluation.types;

import org.bdgenomics.wdl.evaluation.WDLType;
import com.google.common.base.Preconditions;

public class FunctionalType extends WDLType {

  public final WDLType resultType;
  public final WDLType[] argTypes;

  public FunctionalType(WDLType resultType, WDLType... argTypes) {

    Preconditions.checkNotNull(resultType);

    this.resultType = resultType;
    this.argTypes = argTypes;
  }
}
