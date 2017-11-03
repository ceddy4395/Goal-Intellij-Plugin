package nl.tudelft.core.language.prolog;

import com.intellij.lang.Language;

/**
 * Created by Cedric Willekens (4530373) on 11/3/2017.
 */
public class PrologLanguage extends Language {
    public static final PrologLanguage INSTANCE = new PrologLanguage();

    protected PrologLanguage() {
        super("Prolog", "application/swi-prolog");
    }
}
