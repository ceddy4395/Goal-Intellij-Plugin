package nl.tudelft.core.language.actionspec.grammer;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import nl.tudelft.core.language.actionspec.ActionSpecLanguage;
import nl.tudelft.core.language.actionspec.file.ACT2GFile;
import nl.tudelft.core.language.mas.grammer.MasTypes;
import org.apache.xmlbeans.xml.stream.Space;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecParserDefinition implements ParserDefinition {

    private static final TokenSet WHITESPACE = TokenSet.create(TokenType.WHITE_SPACE);
    private static final TokenSet COMMENTS = TokenSet.create(ActionSpecTypes.LINE_COMMENT);
    private static final TokenSet STRINGS = TokenSet.create(ActionSpecTypes.SQSTRING, ActionSpecTypes.DQSTRING);

    private static final IFileElementType FILE = new IFileElementType(ActionSpecLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new ActionSpecLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new ActionSpecParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return ActionSpecTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new ACT2GFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
