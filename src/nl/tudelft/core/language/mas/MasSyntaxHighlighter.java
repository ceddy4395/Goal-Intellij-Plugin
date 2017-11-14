package nl.tudelft.core.language.mas;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.mas.grammer.MasLexerAdapter;
import nl.tudelft.core.language.mas.grammer.MasTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class MasSyntaxHighlighter extends SyntaxHighlighterBase {

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

    private static final Map<IElementType, TextAttributesKey[]> MAPPING = new HashMap<>();

    static {
        MAPPING.put(MasTypes.USE, KEYWORDS);
        MAPPING.put(MasTypes.AS, KEYWORDS);
        MAPPING.put(MasTypes.ENVIRONMENT, KEYWORDS);
        MAPPING.put(MasTypes.WITH, KEYWORDS);
        MAPPING.put(MasTypes.DEFINE, KEYWORDS);
        MAPPING.put(MasTypes.AGENT, KEYWORDS);
        MAPPING.put(MasTypes.MODULE, KEYWORDS);
        MAPPING.put(MasTypes.LAUNCHPOLICY, KEYWORDS);
        MAPPING.put(MasTypes.WHEN, KEYWORDS);
        MAPPING.put(MasTypes.LAUNCH, KEYWORDS);
        MAPPING.put(MasTypes.TYPE, KEYWORDS);
        MAPPING.put(MasTypes.NAME, KEYWORDS);
        MAPPING.put(MasTypes.NUMBER, KEYWORDS);
        MAPPING.put(MasTypes.MAX, KEYWORDS);
        MAPPING.put(MasTypes.USE_CASE_VAL, KEYWORDS);

        MAPPING.put(MasTypes.STRING, STRINGS);
        MAPPING.put(MasTypes.SQSTRING, STRINGS);
        MAPPING.put(MasTypes.DQSTRING, STRINGS);

        MAPPING.put(MasTypes.INTEGER, NUMBERS);
        MAPPING.put(MasTypes.REAL, NUMBERS);

        MAPPING.put(MasTypes.ID, ATOMS);
        MAPPING.put(MasTypes.IDENTIFIER, ATOMS);

        MAPPING.put(MasTypes.STAR, OPERATORS);

        MAPPING.put(MasTypes.LINE_COMMENT, COMMENTS);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new MasLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return MAPPING.getOrDefault(tokenType, EMPTY);
    }
}
