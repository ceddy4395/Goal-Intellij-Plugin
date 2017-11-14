// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleOption;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleOptionImpl extends ASTWrapperPsiElement implements ModuleOption {

  public ModuleOptionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitOption(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getExitVal() {
    return findChildByType(ModuleTypes.EXIT_VAL);
  }

  @Override
  @Nullable
  public PsiElement getFocusVal() {
    return findChildByType(ModuleTypes.FOCUS_VAL);
  }

  @Override
  @Nullable
  public PsiElement getOrderVal() {
    return findChildByType(ModuleTypes.ORDER_VAL);
  }

}
