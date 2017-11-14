package nl.tudelft.core.language.module.grammar;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import nl.tudelft.core.language.module.grammer.ModuleLexer;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/13/2017.
 */
public class ModuleLexerAdapter extends FlexAdapter {
    public ModuleLexerAdapter() {
        super(new ModuleLexer());
    }
}
