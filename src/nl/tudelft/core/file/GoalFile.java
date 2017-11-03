package nl.tudelft.core.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReceiverParameter;
import com.intellij.psi.PsiReference;
import nl.tudelft.core.language.GoalLanguage;
import nl.tudelft.core.language.PredicateContainer;
import nl.tudelft.core.language.PredicateIdentity;
import nl.tudelft.core.language.psi.iface.UseClause;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class GoalFile extends PsiFileBase {

    private FileType type;

    protected GoalFile(@NotNull FileViewProvider viewProvider, @NotNull GoalLanguage language) {
        super(viewProvider, language);

        this.type = language.providedType();
    }


    @NotNull
    @Override
    public FileType getFileType() {
        return this.type;
    }

    public Set<PredicateIdentity> getDeclaredPredicates() {
        return Collections.emptySet();
    }

    public List<PredicateIdentity> getAvailablePredicates() {
        final List<PredicateIdentity> predicates = new ArrayList<>();

        for (final UseClause use: this.findChildrenByClass(UseClause.class)) {
            if (use.getFileReference() == null) {
                continue;
            }

            final PsiReference ref = use.getFileReference().getReference();
            if (ref == null) {
                continue;
            }

            final PsiElement file = ref.resolve();
            if (file != null && file instanceof PredicateContainer) {
                predicates.addAll(((PredicateContainer) file).getDeclaredPredicates());
            }
        }

        return predicates;
    }

}
