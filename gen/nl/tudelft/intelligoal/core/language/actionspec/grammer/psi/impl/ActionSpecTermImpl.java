// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecBasicTerm;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecTerm;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecTermImpl extends ASTWrapperPsiElement implements ActionSpecTerm {

  public ActionSpecTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActionSpecBasicTerm> getBasicTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActionSpecBasicTerm.class);
  }

}
