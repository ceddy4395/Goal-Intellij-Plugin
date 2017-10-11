package nl.tudelft.core.language.psi;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;

public class GoalTokenType extends IElementType {

    public GoalTokenType(@NotNull String debugName) {
        super(debugName, GoalLanguage.instance);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}
