// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasEnvironmentPropertyList;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasEnvironmentSpec;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasString;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasEnvironmentSpecImpl extends ASTWrapperPsiElement implements MasEnvironmentSpec {

  public MasEnvironmentSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitEnvironmentSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MasEnvironmentPropertyList getEnvironmentPropertyList() {
    return findChildByClass(MasEnvironmentPropertyList.class);
  }

  @Override
  @NotNull
  public MasString getString() {
    return findNotNullChildByClass(MasString.class);
  }

}
