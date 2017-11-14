// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecBasicTerm;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecList;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecNumber;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecPredicate;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecString;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecTermList;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecBasicTermImpl extends ASTWrapperPsiElement implements ActionSpecBasicTerm {

  public ActionSpecBasicTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitBasicTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActionSpecList getList() {
    return findChildByClass(ActionSpecList.class);
  }

  @Override
  @Nullable
  public ActionSpecNumber getNumber() {
    return findChildByClass(ActionSpecNumber.class);
  }

  @Override
  @Nullable
  public ActionSpecPredicate getPredicate() {
    return findChildByClass(ActionSpecPredicate.class);
  }

  @Override
  @Nullable
  public ActionSpecString getString() {
    return findChildByClass(ActionSpecString.class);
  }

  @Override
  @Nullable
  public ActionSpecTermList getTermList() {
    return findChildByClass(ActionSpecTermList.class);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(VARIABLE);
  }

}
