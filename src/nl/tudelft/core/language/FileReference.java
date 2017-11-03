package nl.tudelft.core.language;

import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;
import nl.tudelft.core.language.psi.iface.UseFileReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public abstract class FileReference implements PsiReference{

    private static final Map<String, String> EXTENSIONS = new HashMap<String, String>() {{
        this.put("module", ".mod2g");
        this.put("actionspec", ".act2g");
        this.put("knowledge", ".pl");
        this.put("beliefs", ".pl");
        this.put("goals", ".pl");
    }};

    /**
     * The referring element.
     */
    private final UseFileReference referrer;

    /**
     * Creates a new file reference.
     *
     * @param referrer the referring clause
     */
    public FileReference(final UseFileReference referrer) {
        this.referrer = referrer;
    }

    /**
     * Returns the underlying (referencing) element of the reference.
     *
     * @return the underlying element of the reference.
     */
    @Override
    public UseFileReference getElement() {
        return this.referrer;
    }

    /**
     * Returns the part of the underlying element which serves as a reference, or the complete
     * text range of the element if the entire element is a reference.
     *
     * @return Relative range in element
     */
    @Override
    public TextRange getRangeInElement() {
        return new TextRange(0, this.referrer.getTextLength());
    }

    /**
     * Returns the element which is the target of the reference.
     *
     * @return the target element, or null if it was not possible to resolve the reference to a
     *         valid target.
     */
    @Nullable
    @Override
    public PsiElement resolve() {

        final String usage;
        if (this.referrer.getClause().getUsage() != null) {
            usage = this.referrer.getClause().getUsage().getText();
        } else {
            usage = "module";
        }

        final PsiFile containingFile = this.referrer.getContainingFile();
        if (containingFile == null || containingFile.getContainingDirectory() == null) {
            return null;
        }

        final VirtualFile dir = containingFile.getContainingDirectory().getVirtualFile();

        if (this.referrer.getString() != null) {
            // Extract the path name from the string.
            final String dirPath = dir.getCanonicalPath();

            final String pathStr = this.referrer.getString().getText();
            final String rawFilePath = pathStr.substring(1, pathStr.length() - 1).replace("\\", "");

            final String path = dirPath + '/' + rawFilePath;

            final VirtualFile vfile = LocalFileSystem.getInstance().refreshAndFindFileByPath(path);

            if (vfile != null) {
                return PsiManager.getInstance(this.referrer.getProject()).findFile(vfile);
            }

            // Try with the extension appended to it.
            final String extPath = path + EXTENSIONS.get(usage);

            final VirtualFile extVfile = LocalFileSystem.getInstance()
                    .refreshAndFindFileByPath(extPath);

            if (extVfile != null) {
                return PsiManager.getInstance(this.referrer.getProject()).findFile(extVfile);
            }

            // Give up.
            return null;
        } else {
            // Otherwise take a relative path.
            final String path = this.referrer.getText().replace('.', '/');

            final VirtualFile vfile = dir.findFileByRelativePath(path);

            if (vfile != null) {
                return PsiManager.getInstance(this.referrer.getProject()).findFile(vfile);
            }

            // Try with the extension appended to it.
            final String extPath = path + EXTENSIONS.get(usage);

            final VirtualFile extVFile = dir.findFileByRelativePath(extPath);

            if (extVFile != null) {
                return PsiManager.getInstance(this.referrer.getProject()).findFile(extVFile);
            }

            // Give up.
            return null;
        }

    }

    /**
     * Returns the name of the reference target element which does not depend on import statements
     * and other context (for example, the full-qualified name of the class if the reference targets
     * a Java class).
     *
     * @return the canonical text of the reference.
     */
    @NotNull
    @Override
    public String getCanonicalText() {
        return this.referrer.getText();
    }

    /**
     * Called when the reference target element has been renamed, in order to change the reference
     * text according to the new name.
     *
     * @param newElementName the new name of the target element.
     * @return the new underlying element of the reference.
     * @throws IncorrectOperationException if the rename cannot be handled for some reason.
     */
    @Override
    public abstract PsiElement handleElementRename(String newElementName)
            throws IncorrectOperationException;

    /**
     * Changes the reference so that it starts to point to the specified element. This is called,
     * for example, by the "Create Class from New" quickfix, to bind the (invalid) reference on
     * which the quickfix was called to the newly created class.
     *
     * @param element the element which should become the target of the reference.
     * @return the new underlying element of the reference.
     * @throws IncorrectOperationException if the rebind cannot be handled for some reason.
     */
    @Override
    public PsiElement bindToElement(final @NotNull PsiElement element)
            throws IncorrectOperationException {
        return this.referrer;
    }

    /**
     * Checks if the reference targets the specified element.
     *
     * @param element the element to check target for.
     * @return true if the reference targets that element, false otherwise.
     */
    @Override
    public boolean isReferenceTo(final PsiElement element) {
        return (element instanceof PsiFile) && Objects.equals(this.resolve(), element);

    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return PsiElement.EMPTY_ARRAY;
    }

    /**
     * Returns false if the underlying element is guaranteed to be a reference, or true
     * if the underlying element is a possible reference which should not be reported as
     * an error if it fails to resolve. For example, a text in an XML file which looks
     * like a full-qualified Java class name is a soft reference.
     *
     * @return true if the reference is soft, false otherwise.
     */
    @Override
    public boolean isSoft() {
        return false;
    }


}
