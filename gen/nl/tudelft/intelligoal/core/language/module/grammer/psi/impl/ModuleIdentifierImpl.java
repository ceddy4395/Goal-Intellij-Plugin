// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.*;

public class ModuleIdentifierImpl extends ASTWrapperPsiElement implements ModuleIdentifier {

  public ModuleIdentifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAtom() {
    return findChildByType(ATOM);
  }

  @Override
  @Nullable
  public PsiElement getBasicUsageVal() {
    return findChildByType(BASIC_USAGE_VAL);
  }

  @Override
  @Nullable
  public PsiElement getExitVal() {
    return findChildByType(EXIT_VAL);
  }

  @Override
  @Nullable
  public PsiElement getFocusVal() {
    return findChildByType(FOCUS_VAL);
  }

  @Override
  @Nullable
  public PsiElement getOrderVal() {
    return findChildByType(ORDER_VAL);
  }

  @Override
  @Nullable
  public PsiElement getSelectorVal() {
    return findChildByType(SELECTOR_VAL);
  }

  @Override
  @Nullable
  public PsiElement getVariable() {
    return findChildByType(VARIABLE);
  }

}
