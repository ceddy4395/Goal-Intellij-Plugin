// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrologClause extends PsiElement {

  @NotNull
  PrologPredicate getPredicate();

  @Nullable
  PrologTermList getTermList();

}
