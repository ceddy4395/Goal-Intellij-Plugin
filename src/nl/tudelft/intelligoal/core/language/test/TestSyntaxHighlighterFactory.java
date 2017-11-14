package nl.tudelft.intelligoal.core.language.test;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestSyntaxHighlighterFactory extends SyntaxHighlighterFactory{
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new TestSyntaxHighlighter();
    }
}
