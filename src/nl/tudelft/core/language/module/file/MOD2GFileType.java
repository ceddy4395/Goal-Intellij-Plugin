package nl.tudelft.core.language.module.file;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.tudelft.core.Icons;
import nl.tudelft.core.language.module.ModuleLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class MOD2GFileType extends LanguageFileType {

    public static final MOD2GFileType INSTANCE = new MOD2GFileType();

    /**
     * Creates a language file type for the specified language.
     *
     */
    protected MOD2GFileType() {
        super(ModuleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Module file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A Module file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mod2g";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }
}
