// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecPredicateImpl extends ASTWrapperPsiElement implements ActionSpecPredicate {

  public ActionSpecPredicateImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitPredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ActionSpecAtomIdentifier getAtomIdentifier() {
    return findNotNullChildByClass(ActionSpecAtomIdentifier.class);
  }

  @Override
  @Nullable
  public ActionSpecTermList getTermList() {
    return findChildByClass(ActionSpecTermList.class);
  }

}
