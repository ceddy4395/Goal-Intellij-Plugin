package nl.tudelft.intelligoal.core.language.module.grammer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleLexerAdapter extends FlexAdapter {
    public ModuleLexerAdapter() {
        super(new ModuleLexer());
    }
}
