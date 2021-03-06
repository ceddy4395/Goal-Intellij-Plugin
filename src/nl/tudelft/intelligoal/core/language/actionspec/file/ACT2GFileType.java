package nl.tudelft.intelligoal.core.language.actionspec.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.intelligoal.core.Icons;
import nl.tudelft.intelligoal.core.language.actionspec.ActionSpecLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ACT2GFileType extends LanguageFileType {

    public static final ACT2GFileType INSTANCE = new ACT2GFileType();

    /**
     * Creates a language file type for the specified language.
     */
    private ACT2GFileType() {
        super(ActionSpecLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Action File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "File containing action specification";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "act2g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }
}
