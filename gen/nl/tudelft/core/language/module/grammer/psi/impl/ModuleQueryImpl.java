// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.module.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleQueryImpl extends ASTWrapperPsiElement implements ModuleQuery {

  public ModuleQueryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitQuery(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleMood getMood() {
    return findChildByClass(ModuleMood.class);
  }

  @Override
  @Nullable
  public ModulePredicate getPredicate() {
    return findChildByClass(ModulePredicate.class);
  }

  @Override
  @Nullable
  public ModuleSelector getSelector() {
    return findChildByClass(ModuleSelector.class);
  }

  @Override
  @Nullable
  public ModuleTermList getTermList() {
    return findChildByClass(ModuleTermList.class);
  }

}
