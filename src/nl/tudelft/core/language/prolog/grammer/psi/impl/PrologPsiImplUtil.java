package nl.tudelft.core.language.prolog.grammer.psi.impl;

import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import nl.tudelft.core.language.PredicateIdentity;
import nl.tudelft.core.language.prolog.file.PrologFile;
import nl.tudelft.core.language.prolog.grammer.psi.iface.PrologClause;
import nl.tudelft.core.language.prolog.grammer.psi.iface.PrologPredicate;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class PrologPsiImplUtil {
    private PrologPsiImplUtil(){ }

    public static PredicateIdentity asPredicate(PrologPredicate predicate) {
        final String name = predicate.getAtom().getText();
        final int arity;

        if (predicate.getTermList() != null) {
            arity = predicate.getTermList().getChildren().length;
        } else {
            arity = 0;
        }

        final PrologClause clause = (PrologClause) predicate.getParent();
        final PredicateIdentity.Kind kind;

        if (clause.getTermList() == null) {
            kind = PredicateIdentity.Kind.FACT;
        } else {
            kind = PredicateIdentity.Kind.RULE;
        }

        final PredicateIdentity pred = new PredicateIdentity(name, arity, kind);
        pred.setDeclarator(predicate);

        try {
            PsiElement prev = clause.getPrevSibling();
            while (prev != null && prev instanceof PsiWhiteSpace) {
                prev = prev.getPrevSibling();
            }

            if (prev != null && prev instanceof PsiComment) {
                pred.setDocumentation(prev.getText().substring(1).trim());
            }

        } catch (final Exception e) {

        }
        return pred;
    }
}
