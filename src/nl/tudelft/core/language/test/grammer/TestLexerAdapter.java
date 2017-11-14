package nl.tudelft.core.language.test.grammer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestLexerAdapter extends FlexAdapter {
    public TestLexerAdapter() {
        super(new TestLexer());
    }
}
