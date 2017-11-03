// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.psi.iface.UseClause;

public interface ActionSpecUseClause extends UseClause {

  @Nullable
  ActionSpecFileReference getFileReference();

  @Nullable
  ActionSpecUsage getUsage();

}
