// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologCallable;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVariableList;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.prolog.grammer.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologCallableImpl extends ASTWrapperPsiElement implements PrologCallable {

  public PrologCallableImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitCallable(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PrologVariableList getVariableList() {
    return findChildByClass(PrologVariableList.class);
  }

  @Override
  @NotNull
  public PsiElement getAtom() {
    return findNotNullChildByType(ATOM);
  }

}
