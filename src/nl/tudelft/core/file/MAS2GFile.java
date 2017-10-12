package nl.tudelft.core.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class MAS2GFile extends PsiFileBase {
    public MAS2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GoalLanguage.instance);
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
        return super.getIcon(flags);
    }
}
