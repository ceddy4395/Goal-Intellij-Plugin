// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologString;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static nl.tudelft.intelligoal.core.language.prolog.grammer.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologStringImpl extends ASTWrapperPsiElement implements PrologString {

  public PrologStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
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
