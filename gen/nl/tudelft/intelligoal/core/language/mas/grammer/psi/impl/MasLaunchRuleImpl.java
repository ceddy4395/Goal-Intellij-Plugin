// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasEntity;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasInstructionList;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasLaunchRule;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasLaunchRuleImpl extends ASTWrapperPsiElement implements MasLaunchRule {

  public MasLaunchRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitLaunchRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MasEntity getEntity() {
    return findChildByClass(MasEntity.class);
  }

  @Override
  @NotNull
  public MasInstructionList getInstructionList() {
    return findNotNullChildByClass(MasInstructionList.class);
  }

}
