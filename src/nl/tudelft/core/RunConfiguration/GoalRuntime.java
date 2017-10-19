package nl.tudelft.core.RunConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public final class GoalRuntime {
    /**
     * The global instance.
     */
    private static GoalRuntime instance = null;

    /**
     * Returns the runtime instance.
     *
     * @return the instance
     */
    public static GoalRuntime getInstance() {
        if (instance == null) {
            instance = new GoalRuntime();
        }

        return instance;
    }


    /**
     * The path to the extracted runtime.
     */
    private final Path runtimePath;

    /**
     * Extracts the GOAL runtime.
     */
    private GoalRuntime() {
        try {
            this.runtimePath = Files.createTempFile("goal-runtime", ".jar");
            try (InputStream in  = this.getClass().getResourceAsStream("/bin/runtime.jar");
                 OutputStream out = Files.newOutputStream(this.runtimePath)) {
                final byte[] buffer = new byte[8192];
                while (true) {
                    int size = in.read(buffer);

                    if (size < 0) {
                        break;
                    }

                    out.write(buffer, 0, size);
                }
            }


        } catch (IOException e) {
            // Wrap it up and throw it again, no way to deal with it here.
            throw new RuntimeException(e);
        }
    }

    /**
     * The path the runtime is at.
     *
     * @return the path
     */
    public Path getRuntimePath() {
        return this.runtimePath;
    }
}

