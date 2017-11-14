package nl.tudelft.intelligoal.core.language.actionspec.grammer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecLexerAdapter extends FlexAdapter {
    public ActionSpecLexerAdapter() {
        super(new ActionSpecLexer());
    }
}
