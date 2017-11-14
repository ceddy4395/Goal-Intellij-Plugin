// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleFileReference extends PsiElement {

  @Nullable
  ModuleString getString();

  @Nullable
  PsiElement getAtom();

  @Nullable
  PsiElement getVariable();

}
