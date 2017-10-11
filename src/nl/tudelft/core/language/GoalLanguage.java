package nl.tudelft.core.language;

import com.intellij.lang.Language;

public class GoalLanguage extends Language {
    public static final GoalLanguage instance = new GoalLanguage();

    private GoalLanguage() {
        super("Goal");
    }
}
