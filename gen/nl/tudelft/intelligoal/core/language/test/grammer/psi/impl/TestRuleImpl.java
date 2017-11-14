// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestEventuallyRule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestLeadstoRule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestRule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestRuleImpl extends ASTWrapperPsiElement implements TestRule {

  public TestRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TestEventuallyRule getEventuallyRule() {
    return findChildByClass(TestEventuallyRule.class);
  }

  @Override
  @Nullable
  public TestLeadstoRule getLeadstoRule() {
    return findChildByClass(TestLeadstoRule.class);
  }

}
