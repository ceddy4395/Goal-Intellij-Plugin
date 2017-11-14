// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasConstraintList;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasIdentifier;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasInstruction;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasInstructionImpl extends ASTWrapperPsiElement implements MasInstruction {

  public MasInstructionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MasConstraintList getConstraintList() {
    return findChildByClass(MasConstraintList.class);
  }

  @Override
  @NotNull
  public MasIdentifier getIdentifier() {
    return findNotNullChildByClass(MasIdentifier.class);
  }

}
