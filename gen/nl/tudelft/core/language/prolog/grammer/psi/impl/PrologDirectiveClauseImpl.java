// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.prolog.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.prolog.grammer.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologDirectiveClauseImpl extends ASTWrapperPsiElement implements PrologDirectiveClause {

  public PrologDirectiveClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitDirectiveClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PrologPredicateSpec> getPredicateSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologPredicateSpec.class);
  }

  @Override
  @Nullable
  public PsiElement getDirective() {
    return findChildByType(DIRECTIVE);
  }

}
