package nl.tudelft.core.language.prolog.grammer;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.prolog.PrologLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologTokenType extends IElementType {
    public PrologTokenType(@NotNull String debugName) {
        super(debugName, PrologLanguage.INSTANCE);
    }
}
