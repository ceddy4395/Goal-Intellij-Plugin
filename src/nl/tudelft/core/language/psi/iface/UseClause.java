package nl.tudelft.core.language.psi.iface;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public interface UseClause extends PsiElement {

    UseFileReference getFileReference();

    Usage getUsage();

    PsiFile getContainingFile();
}
