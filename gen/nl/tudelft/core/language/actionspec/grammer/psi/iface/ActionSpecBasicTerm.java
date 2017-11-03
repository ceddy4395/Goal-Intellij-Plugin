// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.psi.iface.BasicTerm;

public interface ActionSpecBasicTerm extends BasicTerm {

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

  //WARNING: getReference(...) is skipped
  //matching getReference(ActionSpecBasicTerm, ...)
  //methods are not found in MasPsiUtilImpl

}
