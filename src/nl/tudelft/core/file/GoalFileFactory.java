package nl.tudelft.core.file;

import com.intellij.openapi.fileTypes.*;
import nl.tudelft.core.language.mas.file.MAS2GFileType;
import org.jetbrains.annotations.NotNull;

public class GoalFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(MAS2GFileType.INSTANCE, "mas2g");
    }
}
