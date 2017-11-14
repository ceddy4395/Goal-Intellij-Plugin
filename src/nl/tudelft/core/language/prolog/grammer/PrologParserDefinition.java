package nl.tudelft.core.language.prolog.grammer;

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
import nl.tudelft.core.language.prolog.PrologLanguage;
import nl.tudelft.core.language.prolog.file.PrologFile;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class PrologParserDefinition implements ParserDefinition {

    private static final IFileElementType File =new IFileElementType(PrologLanguage.INSTANCE);

    private static final TokenSet WHITESPACE = TokenSet.create(TokenType.WHITE_SPACE);
    private static final TokenSet COMMENT = TokenSet.create(PrologTypes.LINE_COMMENT);
    private static final TokenSet STRING = TokenSet.create(PrologTypes.STRING, PrologTypes.DQSTRING,
            PrologTypes.SQSTRING);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PrologLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new PrologParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return File;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENT;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return PrologTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PrologFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
