// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.psi.iface.BasicTerm;
import nl.tudelft.core.language.psi.iface.AtomIdentifier;
import nl.tudelft.core.language.psi.iface.TermList;
import nl.tudelft.core.language.psi.iface.UseClause;
import nl.tudelft.core.language.psi.iface.Predicate;
import nl.tudelft.core.language.FileReference;
import nl.tudelft.core.language.psi.iface.Usage;

public class ActionSpecVisitor extends PsiElementVisitor {

  public void visitActionSpec(@NotNull ActionSpecActionSpec o) {
    visitPsiElement(o);
  }

  public void visitAsClause(@NotNull ActionSpecAsClause o) {
    visitPsiElement(o);
  }

  public void visitAtomIdentifier(@NotNull ActionSpecAtomIdentifier o) {
    visitAtomIdentifier(o);
  }

  public void visitBasicTerm(@NotNull ActionSpecBasicTerm o) {
    visitBasicTerm(o);
  }

  public void visitCallable(@NotNull ActionSpecCallable o) {
    visitPsiElement(o);
  }

  public void visitFileReference(@NotNull ActionSpecFileReference o) {
    visitFileReference(o);
  }

  public void visitIdentifier(@NotNull ActionSpecIdentifier o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull ActionSpecList o) {
    visitPsiElement(o);
  }

  public void visitNumber(@NotNull ActionSpecNumber o) {
    visitPsiElement(o);
  }

  public void visitOperator(@NotNull ActionSpecOperator o) {
    visitPsiElement(o);
  }

  public void visitPredicate(@NotNull ActionSpecPredicate o) {
    visitPredicate(o);
  }

  public void visitString(@NotNull ActionSpecString o) {
    visitPsiElement(o);
  }

  public void visitTerm(@NotNull ActionSpecTerm o) {
    visitPsiElement(o);
  }

  public void visitTermList(@NotNull ActionSpecTermList o) {
    visitTermList(o);
  }

  public void visitUsage(@NotNull ActionSpecUsage o) {
    visitUsage(o);
  }

  public void visitUseClause(@NotNull ActionSpecUseClause o) {
    visitUseClause(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
