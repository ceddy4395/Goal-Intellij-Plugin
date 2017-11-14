// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecFileReference;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecIdentifier;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecString;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.ActionSpecVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecFileReferenceImpl extends ASTWrapperPsiElement implements ActionSpecFileReference {

  public ActionSpecFileReferenceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitFileReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActionSpecIdentifier getIdentifier() {
    return findChildByClass(ActionSpecIdentifier.class);
  }

  @Override
  @Nullable
  public ActionSpecString getString() {
    return findChildByClass(ActionSpecString.class);
  }

}
