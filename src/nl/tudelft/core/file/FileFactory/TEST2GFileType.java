package nl.tudelft.core.file.FileFactory;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TEST2GFileType extends LanguageFileType {

    public static final TEST2GFileType INSTANCE = new TEST2GFileType();

    /**
     * Creates a language file type for the specified language.
     */
    protected TEST2GFileType() {
        super(GoalLanguage.instance);
    }

    @NotNull
    @Override
    public String getName() {
        return "Test";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Testing file for an agent";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "test2g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }
}
