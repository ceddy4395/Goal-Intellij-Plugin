package nl.tudelft.core.language.test.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.test.TestLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TEST2GFileType extends LanguageFileType {

    public static final TEST2GFileType INSTANCE = new TEST2GFileType();

    /**
     * Creates a language file type for the specified language.
     */
    protected TEST2GFileType() {
        super(TestLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Goal Test File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A Testing file";
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
