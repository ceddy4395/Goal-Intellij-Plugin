package nl.tudelft.core.language.module.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.Icons;
import nl.tudelft.core.file.GoalFile;
import nl.tudelft.core.language.GoalLanguage;
import nl.tudelft.core.language.module.ModuleLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class MOD2GFile extends GoalFile {
    public MOD2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ModuleLanguage.INSTANCE);
    }

    @Override
    public FileType getFileType() {
        return MOD2GFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Multi-agent module file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.MOD2G;
    }
}
