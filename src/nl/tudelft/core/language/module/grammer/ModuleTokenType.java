package nl.tudelft.core.language.module.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.module.ModuleLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleTokenType extends IElementType {
    public ModuleTokenType(@NotNull String debugName) {
        super(debugName, ModuleLanguage.INSTANCE);
    }
}
