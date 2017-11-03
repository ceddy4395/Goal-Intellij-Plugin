package nl.tudelft.core.language.actionspec.grammer;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.actionspec.ActionSpecLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecElementType extends IElementType {
    public ActionSpecElementType(@NotNull String debugName) {
        super(debugName, ActionSpecLanguage.INSTANCE);
    }
}
