// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.test.grammer.TestTypes;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestBasicTerm;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestList;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestNumber;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestPredicate;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestString;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestTermList;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestBasicTermImpl extends ASTWrapperPsiElement implements TestBasicTerm {

  public TestBasicTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitBasicTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TestList getList() {
    return findChildByClass(TestList.class);
  }

  @Override
  @Nullable
  public TestNumber getNumber() {
    return findChildByClass(TestNumber.class);
  }

  @Override
  @Nullable
  public TestPredicate getPredicate() {
    return findChildByClass(TestPredicate.class);
  }

  @Override
  @Nullable
  public TestString getString() {
    return findChildByClass(TestString.class);
  }

  @Override
  @Nullable
  public TestTermList getTermList() {
    return findChildByClass(TestTermList.class);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(TestTypes.VARIABLE);
  }

}
