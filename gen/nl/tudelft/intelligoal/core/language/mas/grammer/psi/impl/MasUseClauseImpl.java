// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasModuleId;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasUseCase;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasUseClause;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasUseClauseImpl extends ASTWrapperPsiElement implements MasUseClause {

  public MasUseClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitUseClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MasModuleId getModuleId() {
    return findNotNullChildByClass(MasModuleId.class);
  }

  @Override
  @NotNull
  public MasUseCase getUseCase() {
    return findNotNullChildByClass(MasUseCase.class);
  }

}
