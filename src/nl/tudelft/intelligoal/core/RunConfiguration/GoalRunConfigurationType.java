package nl.tudelft.intelligoal.core.RunConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfigurationWithSuppressedDefaultDebugAction;
import nl.tudelft.intelligoal.core.Icons;
import nl.tudelft.intelligoal.core.language.GoalConfigurationFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoalRunConfigurationType implements ConfigurationType, RunConfigurationWithSuppressedDefaultDebugAction {
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
