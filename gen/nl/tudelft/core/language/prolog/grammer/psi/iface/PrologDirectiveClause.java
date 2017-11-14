// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.prolog.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrologDirectiveClause extends PsiElement {

  @NotNull
  List<PrologPredicateSpec> getPredicateSpecList();

  @Nullable
  PsiElement getDirective();

}
