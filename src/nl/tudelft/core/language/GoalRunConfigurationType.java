package nl.tudelft.core.language;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import nl.tudelft.core.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoalRunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Goal";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Run Goal Agents";
    }

    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }

    @NotNull
    @Override
    public String getId() {
        return "GOAL_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new GoalConfigurationFactory(this)};
    }
}
