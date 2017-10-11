package nl.tudelft.core.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.language.GoalIcon;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MOD2GFileType extends LanguageFileType {

    public static final MOD2GFileType INSTANCE = new MOD2GFileType();

    /**
     * Creates a language file type for the specified language.
     *
     */
    protected MOD2GFileType() {
        super(GoalLanguage.instance);
    }

    @NotNull
    @Override
    public String getName() {
        return "module";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A module for an agent";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mod2g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GoalIcon.MOD2G;
    }
}
