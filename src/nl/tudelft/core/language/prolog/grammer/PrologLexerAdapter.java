package nl.tudelft.core.language.prolog.grammer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import nl.tudelft.core.langauge.prolog.grammer.PrologLexer;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologLexerAdapter extends FlexAdapter {
    public PrologLexerAdapter() {
        super(new PrologLexer());
    }
}
