// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologList;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologNumber;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologPredicate;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologString;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologTerm;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologTermList;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologTermImpl extends ASTWrapperPsiElement implements PrologTerm {

  public PrologTermImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PrologList> getListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologList.class);
  }

  @Override
  @NotNull
  public List<PrologNumber> getNumberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologNumber.class);
  }

  @Override
  @NotNull
  public List<PrologPredicate> getPredicateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologPredicate.class);
  }

  @Override
  @NotNull
  public List<PrologString> getStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologString.class);
  }

  @Override
  @NotNull
  public List<PrologTermList> getTermListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologTermList.class);
  }

}
