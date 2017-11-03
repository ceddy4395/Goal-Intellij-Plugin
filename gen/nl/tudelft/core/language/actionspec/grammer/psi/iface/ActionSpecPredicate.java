// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.psi.iface.Predicate;

public interface ActionSpecPredicate extends Predicate {

  @NotNull
  ActionSpecAtomIdentifier getAtomIdentifier();

  @Nullable
  ActionSpecTermList getTermList();

  //WARNING: getIdentifier(...) is skipped
  //matching getIdentifier(ActionSpecPredicate, ...)
  //methods are not found in MasPsiUtilImpl

  //WARNING: asPredicate(...) is skipped
  //matching asPredicate(ActionSpecPredicate, ...)
  //methods are not found in MasPsiUtilImpl

}
