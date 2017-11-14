package nl.tudelft.intelligoal.core.language.prolog.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.intelligoal.core.language.prolog.PrologLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class PrologFile extends PsiFileBase {
    public PrologFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PrologLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PrologFileType.INSTANCE;
    }

}
