package nl.tudelft.core.file;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class GoalFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(MAS2GFileType.INSTANCE, "mas2g");
        consumer.consume(MOD2GFileType.INSTANCE, "mod2g");
        consumer.consume(ACT2GFileType.INSTANCE, "act2g");
    }
}
