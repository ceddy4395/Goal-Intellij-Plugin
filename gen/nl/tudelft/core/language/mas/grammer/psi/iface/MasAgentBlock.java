// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.mas.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MasAgentBlock extends PsiElement {

  @NotNull
  MasIdentifier getIdentifier();

  @NotNull
  List<MasUseClause> getUseClauseList();

}
