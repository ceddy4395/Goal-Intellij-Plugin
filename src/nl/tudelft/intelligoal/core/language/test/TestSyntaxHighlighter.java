package nl.tudelft.intelligoal.core.language.test;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.test.grammer.TestLexerAdapter;
import nl.tudelft.intelligoal.core.language.test.grammer.TestTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestSyntaxHighlighter extends SyntaxHighlighterBase {

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
        MAP.put(TestTypes.PRE, KEYWORDS);
        MAP.put(TestTypes.IN, KEYWORDS);
        MAP.put(TestTypes.POST, KEYWORDS);
        MAP.put(TestTypes.USE, KEYWORDS);
        MAP.put(TestTypes.AS, KEYWORDS);
        MAP.put(TestTypes.BANG, KEYWORDS);
        MAP.put(TestTypes.WHAT, KEYWORDS);
        MAP.put(TestTypes.COLON, KEYWORDS);
        MAP.put(TestTypes.PERCEPT, KEYWORDS);
        MAP.put(TestTypes.BEL, KEYWORDS);
        MAP.put(TestTypes.GOAL, KEYWORDS);
        MAP.put(TestTypes.AGOAL, KEYWORDS);
        MAP.put(TestTypes.GOALA, KEYWORDS);
        MAP.put(TestTypes.LEADSTO, KEYWORDS);

        MAP.put(TestTypes.KNOWLEDGE, KEYWORDS);
        MAP.put(TestTypes.MODULE, KEYWORDS);
        MAP.put(TestTypes.MAS, KEYWORDS);
        MAP.put(TestTypes.TRUE, KEYWORDS);
        MAP.put(TestTypes.NOT, KEYWORDS);

        MAP.put(TestTypes.STRING, STRINGS);
        MAP.put(TestTypes.SQSTRING, STRINGS);
        MAP.put(TestTypes.DQSTRING, STRINGS);

        MAP.put(TestTypes.NUMBER, NUMBERS);
        MAP.put(TestTypes.INTEGER, NUMBERS);
        MAP.put(TestTypes.REAL, NUMBERS);

        MAP.put(TestTypes.ATOM, ATOMS);

        MAP.put(TestTypes.VARIABLE, VARIABLES);

        MAP.put(TestTypes.LINE_COMMENT, COMMENTS);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TestLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return MAP.getOrDefault(tokenType, EMPTY);
    }
}
