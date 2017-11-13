package nl.tudelft.core.language.module;

import com.intellij.openapi.fileTypes.FileType;
import nl.tudelft.core.language.GoalLanguage;
import sun.security.pkcs11.Secmod;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleLanguage extends GoalLanguage {

    public static final ModuleLanguage INSTANCE = new ModuleLanguage();

    public ModuleLanguage() {
        super("Goal Module");
    }

    @Override
    public FileType providedType() {
        return null;
    }
}
