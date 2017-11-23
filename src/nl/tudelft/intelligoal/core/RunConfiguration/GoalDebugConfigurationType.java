package nl.tudelft.intelligoal.core.RunConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import nl.tudelft.intelligoal.core.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoalDebugConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Goal debugger";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Debug Goal Agents";
    }

    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }

    @NotNull
    @Override
    public String getId() {
        return "GOAL_DEBUG_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new GoalDebugConfigurationFactory(this)};
    }
}
