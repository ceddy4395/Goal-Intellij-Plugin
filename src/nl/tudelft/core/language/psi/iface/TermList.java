package nl.tudelft.core.language.psi.iface;

import com.intellij.psi.PsiElement;

import java.util.List;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public interface TermList extends PsiElement {

    List<? extends PsiElement> getTermList();

}
