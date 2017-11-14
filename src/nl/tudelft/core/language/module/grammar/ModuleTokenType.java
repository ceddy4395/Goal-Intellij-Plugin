package nl.tudelft.core.language.module.grammar;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.module.ModuleLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleTokenType extends IElementType {
    public ModuleTokenType(@NotNull String debugName) {
        super(debugName, ModuleLanguage.INSTANCE);
    }
}
