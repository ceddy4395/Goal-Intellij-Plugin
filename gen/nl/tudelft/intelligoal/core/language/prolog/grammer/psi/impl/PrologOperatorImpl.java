// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologOperator;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologOperatorImpl extends ASTWrapperPsiElement implements PrologOperator {

  public PrologOperatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitOperator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

}
