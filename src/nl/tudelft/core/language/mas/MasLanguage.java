package nl.tudelft.core.language.mas;

import com.intellij.openapi.fileTypes.FileType;
import nl.tudelft.core.language.GoalLanguage;
import nl.tudelft.core.language.mas.file.MAS2GFileType;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class MasLanguage extends GoalLanguage {

    public static final MasLanguage INSTANCE = new MasLanguage();

    private MasLanguage() {
        super("GOAL MAS");
    }

    @Override
    public FileType providedType() {
        return MAS2GFileType.INSTANCE;
    }
}
