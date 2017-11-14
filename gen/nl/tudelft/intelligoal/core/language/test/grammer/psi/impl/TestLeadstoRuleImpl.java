// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestLeadstoRule;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestQueryList;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestLeadstoRuleImpl extends ASTWrapperPsiElement implements TestLeadstoRule {

  public TestLeadstoRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitLeadstoRule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TestQueryList> getQueryListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TestQueryList.class);
  }

}
