package nl.tudelft.intelligoal.core.language.mas.file;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.intelligoal.core.Icons;
import nl.tudelft.intelligoal.core.file.GoalFile;
import nl.tudelft.intelligoal.core.language.mas.MasLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MAS2GFile extends GoalFile {
    public MAS2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MasLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MAS2GFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Multi-agent specification file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.MAS2G;
    }
}
