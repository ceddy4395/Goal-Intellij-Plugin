// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleQuery;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleQueryList;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleQueryListImpl extends ASTWrapperPsiElement implements ModuleQueryList {

  public ModuleQueryListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitQueryList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModuleQuery> getQueryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModuleQuery.class);
  }

}
