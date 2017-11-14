package nl.tudelft.intelligoal.core.language.mas.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.mas.MasLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class MasElementType extends IElementType {
    public MasElementType(@NotNull String debugName) {
        super(debugName, MasLanguage.INSTANCE);
    }
}
