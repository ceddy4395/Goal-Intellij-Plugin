package nl.tudelft.core.language.actionspec.grammer.psi.impl;

import com.intellij.psi.PsiCheckedRenameElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecActionSpec;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecBasicTerm;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecIdentifier;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecPredicate;
import nl.tudelft.core.language.psi.iface.Identifier;
import nl.tudelft.core.language.psi.impl.GoalPsiUtilImpl;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecPsiImplUtil {

    public static String getName(final ActionSpecActionSpec spec) {
        return spec.getCallable().getIdentifier().getText();
    }

    public static String getName(final ActionSpecIdentifier identifier) {
        return identifier.getText();
    }

    public static PsiElement setName(final ActionSpecIdentifier identifier,
                                     final String name) {
        final ActionSpecIdentifier replace =
                ActionSpecElementFactory.createIdentifier(identifier.getProject(), name);
        identifier.replace(replace);

        return replace;
    }

    public static Identifier getIdentifier(final ActionSpecPredicate predicate) {
        return predicate.getAtomIdentifier();
    }

    public static PsiReference getReference(ActionSpecBasicTerm term) {
        return GoalPsiUtilImpl.getReference();
    }

}
