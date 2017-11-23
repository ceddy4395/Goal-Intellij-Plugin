package nl.tudelft.intelligoal.core.RunConfiguration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import nl.tudelft.intelligoal.core.ui.GoalSettingsEditor;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GoalDebugConfiguration extends RunConfigurationBase {

    private String runFilePath = "C:/Users/cedri/Documents/TU Delft/Honours Track/BW4T/bw4t.mas2g";

    protected GoalDebugConfiguration(@NotNull Project project, @NotNull ConfigurationFactory factory, String name) {
        super(project, factory, name);
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new GoalSettingsEditor(this.getProject());
    }

    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {
        if (this.runFilePath == null) {
            throw new RuntimeConfigurationException("No file found to debug");
        }
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {


        final CommandLineState state = new CommandLineState(environment) {
            @NotNull
            @Override
            protected ProcessHandler startProcess() throws ExecutionException {
                GoalRuntime runtime = GoalRuntime.instance;
                System.out.println("runtime is created");

                final GeneralCommandLine line = new GeneralCommandLine();
                line.setRedirectErrorStream(true);
                line.setExePath("java");
                line.addParameters("-cp","-debug", runtime.getRuntimePath().toString(),
                        "goal.tools.Run",
                        GoalDebugConfiguration.this.runFilePath);

                System.out.println("command: " + line.getCommandLineString());


                final Process process = line.createProcess();
                return new OSProcessHandler(process, line.getCommandLineString());
            }


        };

        return state;
    }

    @Override
    public void writeExternal(final Element element) throws WriteExternalException {
        super.writeExternal(element);

        if (this.runFilePath != null) {
            final Element fileElement = new Element("file");
            fileElement.setText(this.runFilePath);
            element.addContent(fileElement);
        }
    }

    @Override
    public void readExternal(final Element element) throws InvalidDataException {
        super.readExternal(element);

        final Element fileElement = element.getChild("file");
        if (fileElement != null) {
            this.runFilePath = fileElement.getText();
        }
    }
}
