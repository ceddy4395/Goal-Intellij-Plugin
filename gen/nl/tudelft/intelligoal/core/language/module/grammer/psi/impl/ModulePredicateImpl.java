// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleIdentifier;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModulePredicate;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleTermList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModulePredicateImpl extends ASTWrapperPsiElement implements ModulePredicate {

  public ModulePredicateImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitPredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ModuleIdentifier getIdentifier() {
    return findNotNullChildByClass(ModuleIdentifier.class);
  }

  @Override
  @Nullable
  public ModuleTermList getTermList() {
    return findChildByClass(ModuleTermList.class);
  }

}
