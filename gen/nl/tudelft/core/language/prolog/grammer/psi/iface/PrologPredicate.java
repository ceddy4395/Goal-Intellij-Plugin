// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.prolog.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.PredicateIdentity;

public interface PrologPredicate extends PsiElement {

  @Nullable
  PrologTermList getTermList();

  @NotNull
  PsiElement getAtom();

  PredicateIdentity asPredicate();

}
