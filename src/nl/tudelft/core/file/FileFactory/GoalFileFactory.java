package nl.tudelft.core.file.FileFactory;

import com.intellij.openapi.fileTypes.*;
import nl.tudelft.core.file.PLFileType;
import org.jetbrains.annotations.NotNull;

public class GoalFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(MAS2GFileType.INSTANCE, "mas2g");
        consumer.consume(MOD2GFileType.INSTANCE, "mod2g");
        consumer.consume(ACT2GFileType.INSTANCE, "act2g");
        consumer.consume(TEST2GFileType.INSTANCE, "test2g");
        consumer.consume(PLFileType.INSTANCE, "pl");
    }
}
