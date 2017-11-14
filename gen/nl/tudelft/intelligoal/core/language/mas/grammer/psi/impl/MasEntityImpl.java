// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasEntity;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasSimpleIdentifier;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasEntityImpl extends ASTWrapperPsiElement implements MasEntity {

  public MasEntityImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitEntity(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MasSimpleIdentifier getSimpleIdentifier() {
    return findChildByClass(MasSimpleIdentifier.class);
  }

}
