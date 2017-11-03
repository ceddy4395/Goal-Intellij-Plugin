package nl.tudelft.core.language.prolog.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.language.PredicateContainer;
import nl.tudelft.core.language.PredicateIdentity;
import nl.tudelft.core.language.prolog.PrologLanguage;
import nl.tudelft.core.language.prolog.grammer.psi.iface.PrologClause;
import nl.tudelft.core.language.prolog.grammer.psi.iface.PrologDirectiveClause;
import nl.tudelft.core.language.psi.iface.Predicate;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class PrologFile extends PsiFileBase implements PredicateContainer {
    protected PrologFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PrologLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PrologFileType.INSTANCE;
    }

    @Override
    public Set<PredicateIdentity> getDeclaredPredicates() {
        final Set<PredicateIdentity> predicates = new HashSet<>();

        for (final PrologClause clause: this.findChildrenByClass(PrologClause.class)) {
            predicates.add(clause.getPredicate().asPredicate());
        }

        for (final PrologDirectiveClause directive:
                this.findChildrenByClass(PrologDirectiveClause.class)) {

        }

        return null;
    }
}
