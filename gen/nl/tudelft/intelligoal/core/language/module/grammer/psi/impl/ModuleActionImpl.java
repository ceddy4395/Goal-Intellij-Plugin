// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleAdoptAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleDeleteAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleDropAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleInsertAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModulePredicateAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleSelector;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleSendAction;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleTerm;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleTermList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleActionImpl extends ASTWrapperPsiElement implements ModuleAction {

  public ModuleActionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitAction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleAdoptAction getAdoptAction() {
    return findChildByClass(ModuleAdoptAction.class);
  }

  @Override
  @Nullable
  public ModuleDeleteAction getDeleteAction() {
    return findChildByClass(ModuleDeleteAction.class);
  }

  @Override
  @Nullable
  public ModuleDropAction getDropAction() {
    return findChildByClass(ModuleDropAction.class);
  }

  @Override
  @Nullable
  public ModuleInsertAction getInsertAction() {
    return findChildByClass(ModuleInsertAction.class);
  }

  @Override
  @Nullable
  public ModulePredicateAction getPredicateAction() {
    return findChildByClass(ModulePredicateAction.class);
  }

  @Override
  @Nullable
  public ModuleSelector getSelector() {
    return findChildByClass(ModuleSelector.class);
  }

  @Override
  @Nullable
  public ModuleSendAction getSendAction() {
    return findChildByClass(ModuleSendAction.class);
  }

  @Override
  @Nullable
  public ModuleTerm getTerm() {
    return findChildByClass(ModuleTerm.class);
  }

  @Override
  @Nullable
  public ModuleTermList getTermList() {
    return findChildByClass(ModuleTermList.class);
  }

}
