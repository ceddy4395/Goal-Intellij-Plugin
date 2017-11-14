package nl.tudelft.intelligoal.core.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.intelligoal.core.language.GoalLanguage;
import org.jetbrains.annotations.NotNull;


/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class GoalFile extends PsiFileBase {

    private FileType type;

    protected GoalFile(@NotNull FileViewProvider viewProvider, @NotNull GoalLanguage language) {
        super(viewProvider, language);

        this.type = language.providedType();
    }


    @NotNull
    @Override
    public FileType getFileType() {
        return this.type;
    }

}
