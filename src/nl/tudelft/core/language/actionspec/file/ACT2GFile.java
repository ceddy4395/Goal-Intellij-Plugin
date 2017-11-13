package nl.tudelft.core.language.actionspec.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.Icons;
import nl.tudelft.core.file.GoalFile;
import nl.tudelft.core.language.actionspec.ActionSpecLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ACT2GFile extends GoalFile {
    public ACT2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ActionSpecLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ACT2GFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Multi-agent action specification file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.MOD2G;
    }
}
