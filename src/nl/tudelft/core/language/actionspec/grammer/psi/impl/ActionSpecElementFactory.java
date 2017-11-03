package nl.tudelft.core.language.actionspec.grammer.psi.impl;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import nl.tudelft.core.language.actionspec.ActionSpecLanguage;
import nl.tudelft.core.language.actionspec.file.ACT2GFile;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecFileReference;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecIdentifier;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class ActionSpecElementFactory {

    public static ActionSpecFileReference createFileReference(Project project, String name) {
        final ACT2GFile file = createFile(project, "use " + name
        + ". define ac with pre {true} post {true}");

        if (file.getUseClauses().size() != 1) {
            return null;
        }
        return file.getUseClauses().get(0).getFileReference();

    }

    public static ActionSpecIdentifier createIdentifier(Project project,
                                                        String text) {
        return createFile(project, "use a. define" + text + " with pre { true } post { true }")
                .getActionSpec().getCallable().getIdentifier();
    }


    public static ACT2GFile createFile(Project project, String s) {
        return (ACT2GFile) PsiFileFactory.getInstance(project)
                .createFileFromText(ActionSpecLanguage.INSTANCE, s);

    }

}
