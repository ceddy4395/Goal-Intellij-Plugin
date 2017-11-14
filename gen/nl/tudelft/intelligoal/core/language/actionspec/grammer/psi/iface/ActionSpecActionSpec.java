// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActionSpecActionSpec extends PsiElement {

  @Nullable
  ActionSpecAsClause getAsClause();

  @NotNull
  ActionSpecCallable getCallable();

  @NotNull
  List<ActionSpecTermList> getTermListList();

}
