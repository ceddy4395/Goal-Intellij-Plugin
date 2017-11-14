// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologNumber;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.prolog.grammer.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologNumberImpl extends ASTWrapperPsiElement implements PrologNumber {

  public PrologNumberImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitNumber(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getInteger() {
    return findChildByType(INTEGER);
  }

  @Override
  @Nullable
  public PsiElement getReal() {
    return findChildByType(REAL);
  }

}
