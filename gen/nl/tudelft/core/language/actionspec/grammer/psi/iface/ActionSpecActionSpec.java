// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ActionSpecActionSpec extends PsiElement {

  @Nullable
  ActionSpecAsClause getAsClause();

  @Nullable
  ActionSpecCallable getCallable();

  @NotNull
  List<ActionSpecTermList> getTermListList();

  //WARNING: getName(...) is skipped
  //matching getName(ActionSpecActionSpec, ...)
  //methods are not found in MasPsiUtilImpl

  //WARNING: setName(...) is skipped
  //matching setName(ActionSpecActionSpec, ...)
  //methods are not found in MasPsiUtilImpl

}
