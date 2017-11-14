// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleCallableModule;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleModuleName;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVariableList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleCallableModuleImpl extends ASTWrapperPsiElement implements ModuleCallableModule {

  public ModuleCallableModuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitCallableModule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModuleModuleName getModuleName() {
    return findNotNullChildByClass(ModuleModuleName.class);
  }

  @Override
  @Nullable
  public ModuleVariableList getVariableList() {
    return findChildByClass(ModuleVariableList.class);
  }

}
