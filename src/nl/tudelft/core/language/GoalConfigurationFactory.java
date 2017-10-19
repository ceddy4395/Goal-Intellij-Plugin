package nl.tudelft.core.language;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import nl.tudelft.core.RunConfiguration.GoalRunConfiguration;
import org.jetbrains.annotations.NotNull;

public class GoalConfigurationFactory extends ConfigurationFactory {
    public GoalConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @Override
    public RunConfiguration createTemplateConfiguration(Project project) {
        return new GoalRunConfiguration(project, this, "Goal");
    }
}
