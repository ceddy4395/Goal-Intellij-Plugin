// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.FileReference;

public interface ActionSpecFileReference extends FileReference {

  @Nullable
  ActionSpecIdentifier getIdentifier();

  @Nullable
  ActionSpecString getString();

  //WARNING: getReference(...) is skipped
  //matching getReference(ActionSpecFileReference, ...)
  //methods are not found in MasPsiUtilImpl

}
