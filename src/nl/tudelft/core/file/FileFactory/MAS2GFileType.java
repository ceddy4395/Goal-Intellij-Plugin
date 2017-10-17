package nl.tudelft.core.file.FileFactory;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MAS2GFileType extends LanguageFileType {

    public static final MAS2GFileType INSTANCE = new MAS2GFileType();

    /**
     * Creates a language file type for the specified language.
     *
     */
    private MAS2GFileType () {
        super(GoalLanguage.instance);
    }

    /**
     * Creates a language file type for the specified language.
     *
     * @param language The language used in the files of the type.
     */
    protected MAS2GFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "Goal File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A MAS File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mas2g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.MAS2G;
    }
}
