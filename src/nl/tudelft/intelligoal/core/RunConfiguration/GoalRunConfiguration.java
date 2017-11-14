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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GoalRunConfiguration extends RunConfigurationBase {

    private String runFilePath = null;

    public GoalRunConfiguration(@NotNull Project project, @NotNull ConfigurationFactory factory, String name) {
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
            throw new RuntimeConfigurationException("No file to run.");
        }
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor,
                                    @NotNull ExecutionEnvironment environment)
            throws ExecutionException {
        final CommandLineState state = new CommandLineState(environment) {
            @NotNull
            @Override
            protected ProcessHandler startProcess() throws ExecutionException {
                final GoalRuntime runtime = GoalRuntime.getInstance();

                //TODO: MAke sure that the preferences are used when running goal.
                //final Path preferences = GoalRunConfiguration.this.writePreferences();

                final GeneralCommandLine line = new GeneralCommandLine();
                line.setRedirectErrorStream(true);
                line.setExePath("java");
                line.addParameters(
                        "-cp", runtime.getRuntimePath().toString(),
                        "goal.tools.Run",
                        //preferences.toString(),
                        GoalRunConfiguration.this.runFilePath
                );
                //System.out.println("command: " + line.getCommandLineString());

                final Process process = line.createProcess();

                return new OSProcessHandler(process, line.getCommandLineString());
            }
        };

        return state;
    }

    @Nullable
    public String getRunFile() {
        return this.runFilePath;
    }

    public void setRunFile(final @NotNull String file) {
        this.runFilePath = file;
    }

    private Path writePreferences() {
        try {
            final Path preferences = Files.createTempFile("goal-prefs", ".yml");

            // CHECKSTYLE OFF
            // TODO: make this dynamic
            // CHECKSTYLE ON
            try (InputStream in  = this.getClass().getResourceAsStream("/temp/prefs.yml");
                 OutputStream out = Files.newOutputStream(preferences)) {
                final byte[] buffer = new byte[8192];
                while (true) {
                    int size = in.read(buffer);

                    if (size < 0) {
                        break;
                    }

                    out.write(buffer, 0, size);
                }
            }

            return preferences.toAbsolutePath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
