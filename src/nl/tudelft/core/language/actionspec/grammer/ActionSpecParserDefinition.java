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
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecParserDefinition implements ParserDefinition {

    private static final TokenSet WHITESPACE = TokenSet.create(TokenType.WHITE_SPACE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return null;
    }

    @Override
    public PsiParser createParser(Project project) {
        return null;
    }

    @Override
    public IFileElementType getFileNodeType() {
        return null;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return null;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return null;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return null;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return null;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return null;
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return null;
    }
}
