package nl.tudelft.intelligoal.core.language;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;

public abstract class GoalLanguage extends Language {
    //public static final GoalLanguage instance = new GoalLanguage();

    public GoalLanguage(final String id) {
        super(id);
    }

    public abstract FileType providedType();
}
