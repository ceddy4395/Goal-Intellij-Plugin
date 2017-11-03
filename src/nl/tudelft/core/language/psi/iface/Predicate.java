package nl.tudelft.core.language.psi.iface;

import com.intellij.psi.PsiElement;
import nl.tudelft.core.language.PredicateIdentity;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public interface Predicate extends PsiElement {

    Identifier getIdentifier();

    PredicateIdentity asPredicate();

    TermList getTermList();
}
