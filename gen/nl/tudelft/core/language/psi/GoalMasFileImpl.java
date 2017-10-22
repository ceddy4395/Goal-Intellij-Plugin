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

public class GoalMasFileImpl extends ASTWrapperPsiElement implements GoalMasFile {

  public GoalMasFileImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoalVisitor visitor) {
    visitor.visitMasFile(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoalVisitor) accept((GoalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GoalAgentBlock> getAgentBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GoalAgentBlock.class);
  }

  @Override
  @Nullable
  public GoalEnvironmentSpec getEnvironmentSpec() {
    return findChildByClass(GoalEnvironmentSpec.class);
  }

  @Override
  @NotNull
  public GoalLaunchPolicy getLaunchPolicy() {
    return findNotNullChildByClass(GoalLaunchPolicy.class);
  }

}
