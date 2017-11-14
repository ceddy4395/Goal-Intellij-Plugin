// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.MasTypes;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasIdentifier;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasString;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasIdentifierImpl extends ASTWrapperPsiElement implements MasIdentifier {

  public MasIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MasString getString() {
    return findChildByClass(MasString.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(MasTypes.ID);
  }

}
