package nl.tudelft.intelligoal.core.language.test.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.test.TestLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestElementType extends IElementType {
    public TestElementType(@NotNull String debugName) {
        super(debugName, TestLanguage.INSTANCE);
    }
}
