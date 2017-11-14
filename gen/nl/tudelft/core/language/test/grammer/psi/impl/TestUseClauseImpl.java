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

public class TestUseClauseImpl extends ASTWrapperPsiElement implements TestUseClause {

  public TestUseClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitUseClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TestFileReference getFileReference() {
    return findChildByClass(TestFileReference.class);
  }

  @Override
  @Nullable
  public TestUsage getUsage() {
    return findChildByClass(TestUsage.class);
  }

}
