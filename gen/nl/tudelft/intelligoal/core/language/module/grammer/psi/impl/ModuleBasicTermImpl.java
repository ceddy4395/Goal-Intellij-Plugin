// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleBasicTerm;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleNumber;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModulePredicate;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleString;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleTermList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleBasicTermImpl extends ASTWrapperPsiElement implements ModuleBasicTerm {

  public ModuleBasicTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitBasicTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleList getList() {
    return findChildByClass(ModuleList.class);
  }

  @Override
  @Nullable
  public ModuleNumber getNumber() {
    return findChildByClass(ModuleNumber.class);
  }

  @Override
  @Nullable
  public ModulePredicate getPredicate() {
    return findChildByClass(ModulePredicate.class);
  }

  @Override
  @Nullable
  public ModuleString getString() {
    return findChildByClass(ModuleString.class);
  }

  @Override
  @Nullable
  public ModuleTermList getTermList() {
    return findChildByClass(ModuleTermList.class);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(VARIABLE);
  }

}
