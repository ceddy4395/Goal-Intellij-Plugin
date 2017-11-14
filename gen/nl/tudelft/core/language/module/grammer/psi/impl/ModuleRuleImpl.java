// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.module.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleRuleImpl extends ASTWrapperPsiElement implements ModuleRule {

  public ModuleRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleActionCombo getActionCombo() {
    return findChildByClass(ModuleActionCombo.class);
  }

  @Override
  @Nullable
  public ModuleBlock getBlock() {
    return findChildByClass(ModuleBlock.class);
  }

  @Override
  @Nullable
  public ModuleQueryList getQueryList() {
    return findChildByClass(ModuleQueryList.class);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(VARIABLE);
  }

}
