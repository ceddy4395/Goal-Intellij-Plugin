package nl.tudelft.intelligoal.core.language.actionspec.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.actionspec.ActionSpecLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecElementType extends IElementType {
    public ActionSpecElementType(@NotNull String debugName) {
        super(debugName, ActionSpecLanguage.INSTANCE);
    }
}
