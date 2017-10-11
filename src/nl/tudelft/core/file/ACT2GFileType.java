package nl.tudelft.core.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.language.GoalIcon;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ACT2GFileType extends LanguageFileType {

    public static final ACT2GFileType INSTANCE = new ACT2GFileType();

    /**
     * Creates a language file type for the specified language.
     */
    private ACT2GFileType() {
        super(GoalLanguage.instance);
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
        return GoalIcon.MOD2G;
    }
}
