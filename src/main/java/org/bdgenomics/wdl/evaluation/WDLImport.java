package org.bdgenomics.wdl.evaluation;

import static org.bdgenomics.utils.EqualityUtils.eq;
import static org.bdgenomics.utils.EqualityUtils.of;
import static org.bdgenomics.utils.EqualityUtils.to;
import static org.bdgenomics.utils.HashUtils.hash;
import java.util.Optional;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.parsing.WDLBaseVisitor;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLVisitor;

public class WDLImport implements WDLComponent<WDLImport> {

  public final String location;
  public final Optional<String> name;

  public WDLImport(String location, Optional<String> name) {
    this.location = location;
    this.name = name;
  }

  public int hashCode() { return hash(location, name); }

  public boolean equals(Object o) {
    if(!(o instanceof WDLImport)) { return false; }
    WDLImport i = (WDLImport)o;
    return eq(of(location, name), to(i.location, i.name));
  }

  @Override
  public WDLVisitor<WDLImport> visitor() {
    return new Builder();
  }

  public static class Builder extends WDLBaseVisitor<WDLImport> implements WDLBuilder<WDLImport> {

    @Override
    public WDLImport visitWdlimport(WDLParser.WdlimportContext ctx) {
      final String location = ctx.import_location().getText();
      final WDLParser.Import_nameContext nameCtx = ctx.import_name();
      final String name = nameCtx != null ? nameCtx.getText() : null;

      return new WDLImport(location, Optional.of(name));
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.wdlimport();
    }
  }
}
