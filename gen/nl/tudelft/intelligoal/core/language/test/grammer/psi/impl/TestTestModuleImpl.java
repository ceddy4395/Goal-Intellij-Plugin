// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestIdentifier;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestRule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestTestModule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestTestModuleImpl extends ASTWrapperPsiElement implements TestTestModule {

  public TestTestModuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitTestModule(this);
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
  @NotNull
  public List<TestRule> getRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TestRule.class);
  }

}
