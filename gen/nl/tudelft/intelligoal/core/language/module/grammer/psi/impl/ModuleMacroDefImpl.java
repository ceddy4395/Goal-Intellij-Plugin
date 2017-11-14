// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleCallable;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleMacroDef;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleQueryList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleMacroDefImpl extends ASTWrapperPsiElement implements ModuleMacroDef {

  public ModuleMacroDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitMacroDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleCallable getCallable() {
    return findChildByClass(ModuleCallable.class);
  }

  @Override
  @Nullable
  public ModuleQueryList getQueryList() {
    return findChildByClass(ModuleQueryList.class);
  }

}
