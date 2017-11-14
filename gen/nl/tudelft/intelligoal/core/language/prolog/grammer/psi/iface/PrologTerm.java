// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PrologTerm extends PsiElement {

  @NotNull
  List<PrologList> getListList();

  @NotNull
  List<PrologNumber> getNumberList();

  @NotNull
  List<PrologPredicate> getPredicateList();

  @NotNull
  List<PrologString> getStringList();

  @NotNull
  List<PrologTermList> getTermListList();

}
