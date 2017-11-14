// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.module.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleAction extends PsiElement {

  @Nullable
  ModuleAdoptAction getAdoptAction();

  @Nullable
  ModuleDeleteAction getDeleteAction();

  @Nullable
  ModuleDropAction getDropAction();

  @Nullable
  ModuleInsertAction getInsertAction();

  @Nullable
  ModulePredicateAction getPredicateAction();

  @Nullable
  ModuleSelector getSelector();

  @Nullable
  ModuleSendAction getSendAction();

  @Nullable
  ModuleTerm getTerm();

  @Nullable
  ModuleTermList getTermList();

}
