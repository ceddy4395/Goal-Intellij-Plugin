package nl.tudelft.core.language.test.file;

import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.file.GoalFile;
import nl.tudelft.core.language.GoalLanguage;
import nl.tudelft.core.language.test.TestLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TEST2GFile extends GoalFile {
    public TEST2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TestLanguage.INSTANCE);
    }
}
