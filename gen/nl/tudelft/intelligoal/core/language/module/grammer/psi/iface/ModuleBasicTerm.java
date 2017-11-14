// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleBasicTerm extends PsiElement {

  @Nullable
  ModuleList getList();

  @Nullable
  ModuleNumber getNumber();

  @Nullable
  ModulePredicate getPredicate();

  @Nullable
  ModuleString getString();

  @Nullable
  ModuleTermList getTermList();

  @Nullable
  PsiElement getVariable();

}
