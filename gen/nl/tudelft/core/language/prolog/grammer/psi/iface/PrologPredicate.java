// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.prolog.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrologPredicate extends PsiElement {

  @Nullable
  PrologTermList getTermList();

  @NotNull
  PsiElement getAtom();

  //WARNING: asPredicate(...) is skipped
  //matching asPredicate(PrologPredicate, ...)
  //methods are not found in PrologPsiImplUtil

}