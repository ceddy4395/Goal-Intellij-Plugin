package nl.tudelft.intelligoal.core.language.module;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import nl.tudelft.intelligoal.core.language.module.grammer.ModuleLexerAdapter;
import nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class ModuleSyntaxHighligther extends SyntaxHighlighterBase {

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
        MAP.put(ModuleTypes.USE, KEYWORDS);
        MAP.put(ModuleTypes.AS, KEYWORDS);
        MAP.put(ModuleTypes.MODULE, KEYWORDS);
        MAP.put(ModuleTypes.DEFINE, KEYWORDS);
        MAP.put(ModuleTypes.ORDER, KEYWORDS);
        MAP.put(ModuleTypes.EXIT, KEYWORDS);
        MAP.put(ModuleTypes.FOCUS, KEYWORDS);
        MAP.put(ModuleTypes.MOOD, KEYWORDS);
        MAP.put(ModuleTypes.BEL, KEYWORDS);
        MAP.put(ModuleTypes.PERCEPT, KEYWORDS);
        MAP.put(ModuleTypes.GOAL, KEYWORDS);
        MAP.put(ModuleTypes.AGOAL, KEYWORDS);
        MAP.put(ModuleTypes.GOALA, KEYWORDS);
        MAP.put(ModuleTypes.NOT, KEYWORDS);
        MAP.put(ModuleTypes.TRUE, KEYWORDS); //Consider different color
        MAP.put(ModuleTypes.IF, KEYWORDS);
        MAP.put(ModuleTypes.THEN, KEYWORDS);
        MAP.put(ModuleTypes.FORALL, KEYWORDS);
        MAP.put(ModuleTypes.DO, KEYWORDS);
        MAP.put(ModuleTypes.LISTALL, KEYWORDS);
        MAP.put(ModuleTypes.SEND, KEYWORDS);
        MAP.put(ModuleTypes.SENT, KEYWORDS);
        MAP.put(ModuleTypes.EXIT_MODULE, KEYWORDS);
        MAP.put(ModuleTypes.LOG, KEYWORDS);
        MAP.put(ModuleTypes.PRINT, KEYWORDS);
        MAP.put(ModuleTypes.INSERT, KEYWORDS);
        MAP.put(ModuleTypes.DELETE, KEYWORDS);
        MAP.put(ModuleTypes.ADOPT, KEYWORDS);
        MAP.put(ModuleTypes.DROP, KEYWORDS);
        MAP.put(ModuleTypes.BASIC_USAGE_VAL, KEYWORDS);
        MAP.put(ModuleTypes.ORDER_VAL, KEYWORDS);
        MAP.put(ModuleTypes.EXIT_VAL, KEYWORDS);
        MAP.put(ModuleTypes.FOCUS_VAL, KEYWORDS);
        MAP.put(ModuleTypes.SELECTOR_VAL, KEYWORDS);

        MAP.put(ModuleTypes.BANG, OPERATORS);
        MAP.put(ModuleTypes.WHAT, OPERATORS);
        MAP.put(ModuleTypes.COLON, OPERATORS);
        MAP.put(ModuleTypes.REVERSE_SNEK, OPERATORS);

        MAP.put(ModuleTypes.OPERATOR, OPERATORS);

        MAP.put(ModuleTypes.STRING, STRINGS);
        MAP.put(ModuleTypes.SQSTRING, STRINGS);
        MAP.put(ModuleTypes.DQSTRING, STRINGS);

        MAP.put(ModuleTypes.NUMBER, NUMBERS);
        MAP.put(ModuleTypes.INTEGER, NUMBERS);
        MAP.put(ModuleTypes.REAL, NUMBERS);

        MAP.put(ModuleTypes.ATOM, ATOMS);

        MAP.put(ModuleTypes.VARIABLE, VARIABLES);

        MAP.put(ModuleTypes.LINE_COMMENT, COMMENTS);

    }


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new ModuleLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return MAP.getOrDefault(tokenType, EMPTY);
    }
}
