// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.test.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TestBasicTerm extends PsiElement {

  @Nullable
  TestList getList();

  @Nullable
  TestNumber getNumber();

  @Nullable
  TestPredicate getPredicate();

  @Nullable
  TestString getString();

  @Nullable
  TestTermList getTermList();

  @Nullable
  PsiElement getVariable();

}
