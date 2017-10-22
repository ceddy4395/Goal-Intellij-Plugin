// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.psi.GOALType.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class GoalAgentBlockImpl extends ASTWrapperPsiElement implements GoalAgentBlock {

  public GoalAgentBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoalVisitor visitor) {
    visitor.visitAgentBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoalVisitor) accept((GoalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GoalIdentifier getIdentifier() {
    return findNotNullChildByClass(GoalIdentifier.class);
  }

  @Override
  @NotNull
  public List<GoalUseClause> getUseClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GoalUseClause.class);
  }

}
