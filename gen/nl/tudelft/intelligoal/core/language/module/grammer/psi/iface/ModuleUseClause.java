// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.iface;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ModuleUseClause extends PsiElement {

  @Nullable
  ModuleFileReference getFileReference();

  @Nullable
  ModuleUsage getUsage();

}
