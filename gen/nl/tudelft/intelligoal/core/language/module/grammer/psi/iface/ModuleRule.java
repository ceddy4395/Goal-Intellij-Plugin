// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleRule extends PsiElement {

  @Nullable
  ModuleActionCombo getActionCombo();

  @Nullable
  ModuleBlock getBlock();

  @Nullable
  ModuleQueryList getQueryList();

  @Nullable
  PsiElement getVariable();

}
