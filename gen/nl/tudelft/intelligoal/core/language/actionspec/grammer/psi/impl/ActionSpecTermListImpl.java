// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecTerm;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecTermList;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecTermListImpl extends ASTWrapperPsiElement implements ActionSpecTermList {

  public ActionSpecTermListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitTermList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ActionSpecTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActionSpecTerm.class);
  }

}
