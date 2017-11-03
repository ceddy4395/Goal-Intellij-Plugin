package nl.tudelft.core.language.prolog.file;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.prolog.PrologLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class PrologFileType extends LanguageFileType {

    public static final PrologFileType INSTANCE = new PrologFileType();

    /**
     * Creates a language file type for the specified language.
     *
     */
    protected PrologFileType() {
        super(PrologLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "GOAL Prolog knowledge";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "GOAL Prolog knowledge file";
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
