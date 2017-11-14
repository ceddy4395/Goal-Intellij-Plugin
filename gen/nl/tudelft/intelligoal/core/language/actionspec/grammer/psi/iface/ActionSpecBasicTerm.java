// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActionSpecBasicTerm extends PsiElement {

  @Nullable
  ActionSpecList getList();

  @Nullable
  ActionSpecNumber getNumber();

  @Nullable
  ActionSpecPredicate getPredicate();

  @Nullable
  ActionSpecString getString();

  @Nullable
  ActionSpecTermList getTermList();

  @Nullable
  PsiElement getVariable();

}
