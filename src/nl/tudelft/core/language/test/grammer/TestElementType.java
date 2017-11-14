package nl.tudelft.core.language.test.grammer;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.test.TestLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestElementType extends IElementType {
    public TestElementType(@NotNull String debugName) {
        super(debugName, TestLanguage.INSTANCE);
    }
}
