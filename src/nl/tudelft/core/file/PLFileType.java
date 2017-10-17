package nl.tudelft.core.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PLFileType extends LanguageFileType {

    public static final PLFileType INSTANCE = new PLFileType();


    /**
     * Creates a language file type for the specified language.
     */
    protected PLFileType() {
        super(GoalLanguage.instance);
    }

    @NotNull
    @Override
    public String getName() {
        return "Prolog file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Prolog File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.PL;
    }
}
