package nl.tudelft.core.language.actionspec;

import com.intellij.openapi.fileTypes.FileType;
import nl.tudelft.core.language.GoalLanguage;
import nl.tudelft.core.language.actionspec.file.ACT2GFileType;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecLanguage extends GoalLanguage {

    public static final ActionSpecLanguage INSTANCE = new ActionSpecLanguage();

    public ActionSpecLanguage() {
        super("GOAL actionspec");
    }

    @Override
    public FileType providedType() {
        return ACT2GFileType.INSTANCE;
    }
}
