package nl.tudelft.intelligoal.core.RunConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class GoalDebugConfigurationFactory extends ConfigurationFactory {
    protected GoalDebugConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new GoalDebugConfiguration(project,this, "Goal Debugger");
    }
}
