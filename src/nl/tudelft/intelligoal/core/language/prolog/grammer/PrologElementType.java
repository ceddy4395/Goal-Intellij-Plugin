package nl.tudelft.intelligoal.core.language.prolog.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.prolog.PrologLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologElementType extends IElementType {
    public PrologElementType(@NotNull String debugName) {
        super(debugName, PrologLanguage.INSTANCE);
    }
}
