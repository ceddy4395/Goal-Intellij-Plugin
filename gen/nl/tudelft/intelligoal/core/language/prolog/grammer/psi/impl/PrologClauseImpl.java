// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologClause;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologPredicate;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologTermList;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologClauseImpl extends ASTWrapperPsiElement implements PrologClause {

  public PrologClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PrologPredicate getPredicate() {
    return findNotNullChildByClass(PrologPredicate.class);
  }

  @Override
  @Nullable
  public PrologTermList getTermList() {
    return findChildByClass(PrologTermList.class);
  }

}
