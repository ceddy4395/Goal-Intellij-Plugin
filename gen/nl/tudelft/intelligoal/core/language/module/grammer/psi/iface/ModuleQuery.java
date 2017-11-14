// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleQuery extends PsiElement {

  @Nullable
  ModuleMood getMood();

  @Nullable
  ModulePredicate getPredicate();

  @Nullable
  ModuleSelector getSelector();

  @Nullable
  ModuleTermList getTermList();

}
