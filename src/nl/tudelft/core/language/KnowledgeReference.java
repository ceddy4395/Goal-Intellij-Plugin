package nl.tudelft.core.language;

import com.intellij.codeInsight.lookup.AutoCompletionPolicy;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.CollectConsumer;
import com.intellij.util.IncorrectOperationException;
import nl.tudelft.core.language.prolog.file.PrologFile;
import nl.tudelft.core.language.prolog.file.PrologFileType;
import nl.tudelft.core.language.psi.iface.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public abstract class KnowledgeReference implements PsiPolyVariantReference {

    private final Identifier referrer;

    public KnowledgeReference(Identifier referrer) {
        this.referrer = referrer;
    }

    @NotNull
    @Override
    public abstract ResolveResult[] multiResolve(boolean incompleteCode);

    @Override
    public PsiElement getElement() {
        return this.referrer;
    }

    @Override
    public TextRange getRangeInElement() {
        return new TextRange(0, this.referrer.getTextLength());
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        final ResolveResult[] results = this.multiResolve(false);
        if (results.length > 0) {
            return results[0].getElement();
        }
        return null;
    }

    @NotNull
    @Override
    public String getCanonicalText() {
        return this.referrer.getText();
    }

    @Override
    public abstract PsiElement handleElementRename(String newElementName)
            throws IncorrectOperationException;

    @Override
    public PsiElement bindToElement(@NotNull PsiElement element) throws IncorrectOperationException {
        return null;
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        return false;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        final GlobalSearchScope searchScope = GlobalSearchScope.allScope(this.referrer.getProject());
        final Collection<VirtualFile> knowledgeFiles =
                FileTypeIndex.getFiles(PrologFileType.INSTANCE, searchScope);

        final PsiManager manager = PsiManager.getInstance(this.referrer.getProject());

        return knowledgeFiles.stream().map(manager::findFile).filter(f -> f != null
                && f instanceof PrologFile)
                .flatMap(f -> ((PrologFile)f).getDeclaredPredicates().stream())
                .map(pi -> LookupElementBuilder
                    .createWithSmartPointer(pi.getName(), pi.getDeclarator())
                .withTailText("/"+pi.getArity())
                .withTypeText(pi.getDeclarator().getContainingFile().getName(), true)
                .withAutoCompletionPolicy(AutoCompletionPolicy.GIVE_CHANCE_TO_OVERWRITE)).toArray();

    }

    @Override
    public boolean isSoft() {
        return false;
    }
}
