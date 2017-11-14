// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestString;
import nl.tudelft.intelligoal.core.language.test.grammer.psi.iface.TestVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.test.grammer.TestTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.test.grammer.psi.iface.*;

public class TestStringImpl extends ASTWrapperPsiElement implements TestString {

  public TestStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TestVisitor visitor) {
    visitor.visitString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TestVisitor) accept((TestVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getDqstring() {
    return findChildByType(DQSTRING);
  }

  @Override
  @Nullable
  public PsiElement getSqstring() {
    return findChildByType(SQSTRING);
  }

}
