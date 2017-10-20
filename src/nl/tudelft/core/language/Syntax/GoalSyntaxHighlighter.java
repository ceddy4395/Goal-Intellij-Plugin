package nl.tudelft.core.language.Syntax;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.GoalLexerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class GoalSyntaxHighlighter extends SyntaxHighlighterBase {
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

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GoalLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return MAPPING.getOrDefault(tokenType, EMPTY);
    }

    private static final Map<IElementType, TextAttributesKey[]> MAPPING = new HashMap<>();

    static {
//        MAPPING.put(GOALType.USE, KEYWORDS);
//        MAPPING.put(GOALType.AS, KEYWORDS);
//        MAPPING.put(GOALType.ENVIRONMENT, KEYWORDS);
//        MAPPING.put(GOALType.WITH, KEYWORDS);
//        MAPPING.put(GOALType.DEFINE, KEYWORDS);
////        MAPPING.put(GOALType.AGENT, KEYWORDS);
//        MAPPING.put(GOALType.MODULE, KEYWORDS);
////        MAPPING.put(GOALType.LAUNCHPOLICY, KEYWORDS);
////        MAPPING.put(GOALType.WHEN, KEYWORDS);
////        MAPPING.put(GOALType.LAUNCH, KEYWORDS);
////        MAPPING.put(GOALType.TYPE, KEYWORDS);
////        MAPPING.put(GOALType.NAME, KEYWORDS);
//        MAPPING.put(GOALType.NUMBER, KEYWORDS);
////        MAPPING.put(GOALType.MAX, KEYWORDS);
////        MAPPING.put(GOALType.USE_CASE_VAL, KEYWORDS);
//
//        MAPPING.put(GOALType.STRING, STRINGS);
//        MAPPING.put(GOALType.SQSTRING, STRINGS);
//        MAPPING.put(GOALType.DQSTRING, STRINGS);
//
//        MAPPING.put(GOALType.INTEGER, NUMBERS);
//        MAPPING.put(GOALType.REAL, NUMBERS);
//
////        MAPPING.put(GOALType.ID, ATOMS);
////        MAPPING.put(GOALType.IDENTIFIER, ATOMS);
//
////        MAPPING.put(GOALType.STAR, OPERATORS);
//
//        MAPPING.put(GOALType.LINE_COMMENT, COMMENTS);
    }
}
