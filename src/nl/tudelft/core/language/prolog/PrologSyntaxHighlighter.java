package nl.tudelft.core.language.prolog;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.vcs.log.impl.VcsProjectLog;
import nl.tudelft.core.language.prolog.grammer.PrologLexerAdapter;
import nl.tudelft.core.language.prolog.grammer.PrologTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("KEYWORD",
                    DefaultLanguageHighlighterColors.KEYWORD);

    private static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("STRING",
                    DefaultLanguageHighlighterColors.STRING);

    private static final TextAttributesKey NUMBER =
            TextAttributesKey.createTextAttributesKey("NUMBER",
                    DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey ATOM =
            TextAttributesKey.createTextAttributesKey("ATOM",
                    DefaultLanguageHighlighterColors.INSTANCE_METHOD);

    private static final TextAttributesKey OPERATOR =
            TextAttributesKey.createTextAttributesKey("OPERATOR",
                    DefaultLanguageHighlighterColors.OPERATION_SIGN);

    private static final TextAttributesKey VARIABLE =
            TextAttributesKey.createTextAttributesKey("VARIABLE",
                    DefaultLanguageHighlighterColors.STATIC_FIELD);

    private static final TextAttributesKey COMMENT =
            TextAttributesKey.createTextAttributesKey("COMMENT",
                    DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey DOC_COMMENT =
            TextAttributesKey.createTextAttributesKey("DOC_COMMENT",
                    DefaultLanguageHighlighterColors.DOC_COMMENT);


    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[] {KEYWORD};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[] {STRING};
    private static final TextAttributesKey[] NUMBERS = new TextAttributesKey[] {NUMBER};
    private static final TextAttributesKey[] ATOMS = new TextAttributesKey[] {ATOM};
    private static final TextAttributesKey[] OPERATORS = new TextAttributesKey[] {OPERATOR};
    private static final TextAttributesKey[] VARIABLES = new TextAttributesKey[] {VARIABLE};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[] {COMMENT};
    private static final TextAttributesKey[] DOC_COMMENTS = new TextAttributesKey[] {DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    private static final Map<IElementType, TextAttributesKey[]> MAP = new HashMap<>();

    static {
        MAP.put(PrologTypes.DIRECTIVE, KEYWORDS);
        MAP.put(PrologTypes.NECK, OPERATORS);
        MAP.put(PrologTypes.OPERATOR, OPERATORS);
        MAP.put(PrologTypes.PREDICATE, VARIABLES);

        MAP.put(PrologTypes.STRING, STRINGS);
        MAP.put(PrologTypes.SQSTRING, STRINGS);
        MAP.put(PrologTypes.DQSTRING, STRINGS);

        MAP.put(PrologTypes.NUMBER, NUMBERS);
        MAP.put(PrologTypes.REAL, NUMBERS);
        MAP.put(PrologTypes.INTEGER, NUMBERS);

        MAP.put(PrologTypes.ATOM, ATOMS);
        MAP.put(PrologTypes.VARIABLE, VARIABLES);
        MAP.put(PrologTypes.LINE_COMMENT, COMMENTS);
        MAP.put(PrologTypes.DOC_COMMENT, DOC_COMMENTS);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PrologLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return MAP.getOrDefault(tokenType, EMPTY);
    }
}
