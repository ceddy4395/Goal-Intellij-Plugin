package nl.tudelft.core.language.psi.iface;

import com.intellij.psi.PsiElement;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public interface UseFileReference extends PsiElement {

    PsiElement getString();

    String getText();

    default UseClause getClause() {
        return (UseClause)this.getParent();
    }
}
