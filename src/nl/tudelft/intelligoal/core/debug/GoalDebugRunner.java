package nl.tudelft.intelligoal.core.debug;

import com.intellij.debugger.engine.RemoteDebugProcessHandler;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/15/2017.
 */
public class GoalDebugRunner extends GenericProgramRunner {

    public static final String GOALDEBUGRUNNER = "GoalDebugRunner";

    @NotNull
    @Override
    public String getRunnerId() {
        return GOALDEBUGRUNNER;
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        if (!DefaultDebugExecutor.EXECUTOR_ID.equals(executorId)) {
            // If not debug at all
            return false;
        }
        return true;
    }
}
