// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecOperator;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecOperatorImpl extends ASTWrapperPsiElement implements ActionSpecOperator {

  public ActionSpecOperatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitOperator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAtom() {
    return findChildByType(ATOM);
  }

}
