package nl.tudelft.core.language.actionspec.file;

import com.intellij.psi.FileViewProvider;
import nl.tudelft.core.file.GoalFile;
import nl.tudelft.core.language.PredicateIdentity;
import nl.tudelft.core.language.PredicateUser;
import nl.tudelft.core.language.actionspec.ActionSpecLanguage;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecActionSpec;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.ActionSpecUseClause;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class ACT2GFile extends GoalFile implements PredicateUser {
    protected ACT2GFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ActionSpecLanguage.INSTANCE);
    }

    public List<ActionSpecUseClause> getUseClauses() {
        return Arrays.asList(this.findChildrenByClass(ActionSpecUseClause.class));
    }

    public List<ActionSpecActionSpec> getActionSpecs() {
        return Arrays.asList(this.findChildrenByClass(ActionSpecActionSpec.class));
    }

    public ActionSpecActionSpec getActionSpec() {
        return this.findChildByClass(ActionSpecActionSpec.class);
    }

    @Override
    public List<PredicateIdentity> getAvailablePredicates() {
        return null;
    }
}
