package nl.tudelft.intelligoal.core.language.module.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.module.ModuleLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleElementType extends IElementType {
    public ModuleElementType(@NotNull String debugName) {
        super(debugName, ModuleLanguage.INSTANCE);
    }
}
