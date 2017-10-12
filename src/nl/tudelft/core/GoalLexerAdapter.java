package nl.tudelft.core;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class GoalLexerAdapter extends FlexAdapter {
    public GoalLexerAdapter() {
        super(new GOALLexer((Reader)null));
    }
}
