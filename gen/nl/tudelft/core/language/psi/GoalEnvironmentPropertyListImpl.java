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

public class GoalEnvironmentPropertyListImpl extends ASTWrapperPsiElement implements GoalEnvironmentPropertyList {

  public GoalEnvironmentPropertyListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoalVisitor visitor) {
    visitor.visitEnvironmentPropertyList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoalVisitor) accept((GoalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GoalEnvironmentProperty> getEnvironmentPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GoalEnvironmentProperty.class);
  }

}
