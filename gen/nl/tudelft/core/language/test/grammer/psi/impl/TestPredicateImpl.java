// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.test.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.test.grammer.TestTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestPredicateImpl extends ASTWrapperPsiElement implements TestPredicate {

  public TestPredicateImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitPredicate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public TestIdentifier getIdentifier() {
    return findNotNullChildByClass(TestIdentifier.class);
  }

  @Override
  @Nullable
  public TestTermList getTermList() {
    return findChildByClass(TestTermList.class);
  }

}
