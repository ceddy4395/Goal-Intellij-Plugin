// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.test.grammer.TestTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.*;

public class TestQueryImpl extends ASTWrapperPsiElement implements TestQuery {

  public TestQueryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitQuery(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TestMood getMood() {
    return findChildByClass(TestMood.class);
  }

  @Override
  @Nullable
  public TestPredicate getPredicate() {
    return findChildByClass(TestPredicate.class);
  }

  @Override
  @Nullable
  public TestTermList getTermList() {
    return findChildByClass(TestTermList.class);
  }

}
