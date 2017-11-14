// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecString;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecStringImpl extends ASTWrapperPsiElement implements ActionSpecString {

  public ActionSpecStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDqstring() {
    return findChildByType(ActionSpecTypes.DQSTRING);
  }

  @Override
  @Nullable
  public PsiElement getSqstring() {
    return findChildByType(ActionSpecTypes.SQSTRING);
  }

}
