package nl.tudelft.intelligoal.core.language.prolog.grammer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologLexerAdapter extends FlexAdapter {
    public PrologLexerAdapter() {
        super(new PrologLexer());
    }
}
