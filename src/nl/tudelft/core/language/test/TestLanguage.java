package nl.tudelft.core.language.test;

import com.intellij.openapi.fileTypes.FileType;
import nl.tudelft.core.language.GoalLanguage;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestLanguage extends GoalLanguage {

    public static final TestLanguage INSTANCE = new TestLanguage();

    public TestLanguage() {
        super("GOAL Test");
    }

    @Override
    public FileType providedType() {
        return null;
    }
}
