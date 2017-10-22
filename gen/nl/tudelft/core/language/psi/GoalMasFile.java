// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoalMasFile extends PsiElement {

  @NotNull
  List<GoalAgentBlock> getAgentBlockList();

  @Nullable
  GoalEnvironmentSpec getEnvironmentSpec();

  @NotNull
  GoalLaunchPolicy getLaunchPolicy();

}
