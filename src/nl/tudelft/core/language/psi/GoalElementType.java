package nl.tudelft.core.language.psi;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;

public class GoalElementType extends IElementType {
    public GoalElementType(@NotNull String debugName) {
        super(debugName, GoalLanguage.instance);
    }
}
