package nl.tudelft.core.language.psi.impl;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveResult;
import com.intellij.util.IncorrectOperationException;
import nl.tudelft.core.file.GoalFile;
import nl.tudelft.core.language.KnowledgeReference;
import nl.tudelft.core.language.PredicateIdentity;
import nl.tudelft.core.language.psi.iface.BasicTerm;
import nl.tudelft.core.language.psi.iface.Predicate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class GoalPsiUtilImpl {
    public static PredicateIdentity asPredicate(final @NotNull Predicate pred) {
        final String name = pred.getIdentifier().getText();

        final int arity;
        if (pred.getTermList() != null) {
            arity = pred.getTermList().getTermList().size();
        } else {
            arity = 0;
        }

        final PredicateIdentity predicate =
                new PredicateIdentity(name, arity, PredicateIdentity.Kind.REFERENCE);
        predicate.setDeclarator(pred);

        return predicate;
    }

    public static PsiReference getReference(final @NotNull BasicTerm term,
                                            final @NotNull Function<String, PsiElement> onRename) {
        final Predicate pred = term.getPredicate();

        if (pred == null) {
            return null;
        }

        final PredicateIdentity predicate = pred.asPredicate();
        final GoalFile file = (GoalFile) term.getContainingFile();
        final List<PredicateIdentity> availablePredicates = file.getAvailablePredicates();

        return new KnowledgeReference(pred.getIdentifier()) {
            @NotNull
            @Override
            public ResolveResult[] multiResolve(final boolean incompleteCode) {
                return availablePredicates.stream()
                        .filter(p -> p.isEquivalent(predicate))
                        .map(p -> new ResolveResult() {
                                    /**
                                     * Returns the result of the resolve.
                                     *
                                     * @return an element the reference is resolved to.
                                     */
                                    @Nullable
                                    @Override
                                    public PsiElement getElement() {
                                        return p.getDeclarator();
                                    }

                                    /**
                                     * Checks if the reference was resolved to a valid element.
                                     *
                                     * @return true if the resolve encountered no problems
                                     */
                                    @Override
                                    public boolean isValidResult() {
                                        return true;
                                    }
                                }
                        ).toArray(ResolveResult[]::new);
            }

            @Override
            public PsiElement handleElementRename(final String newElementName)
                    throws IncorrectOperationException {
                return onRename.apply(newElementName);
            }
        };
    }

}
