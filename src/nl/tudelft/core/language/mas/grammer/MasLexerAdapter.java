package nl.tudelft.core.language.mas.grammer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class MasLexerAdapter extends FlexAdapter {
    public MasLexerAdapter() {
        super(new MasLexer());
    }
}
