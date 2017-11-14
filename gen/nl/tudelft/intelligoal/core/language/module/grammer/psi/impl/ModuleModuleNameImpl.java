// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleModuleName;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleString;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleModuleNameImpl extends ASTWrapperPsiElement implements ModuleModuleName {

  public ModuleModuleNameImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitModuleName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleString getString() {
    return findChildByClass(ModuleString.class);
  }

  @Override
  @Nullable
  public PsiElement getAtom() {
    return findChildByType(ModuleTypes.ATOM);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(ModuleTypes.VARIABLE);
  }

}
