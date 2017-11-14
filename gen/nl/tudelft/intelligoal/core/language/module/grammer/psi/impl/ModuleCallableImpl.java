// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleCallable;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVariableList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleCallableImpl extends ASTWrapperPsiElement implements ModuleCallable {

  public ModuleCallableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitCallable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleVariableList getVariableList() {
    return findChildByClass(ModuleVariableList.class);
  }

  @Override
  @NotNull
  public PsiElement getAtom() {
    return findNotNullChildByType(ATOM);
  }

}
