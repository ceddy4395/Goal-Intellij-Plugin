// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleBlock;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleCallableModule;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleModuleClause;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleModuleClauseImpl extends ASTWrapperPsiElement implements ModuleModuleClause {

  public ModuleModuleClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitModuleClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleBlock getBlock() {
    return findChildByClass(ModuleBlock.class);
  }

  @Override
  @Nullable
  public ModuleCallableModule getCallableModule() {
    return findChildByClass(ModuleCallableModule.class);
  }

}
