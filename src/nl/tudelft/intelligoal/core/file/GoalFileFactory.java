package nl.tudelft.intelligoal.core.file;

import com.intellij.openapi.fileTypes.*;
import nl.tudelft.intelligoal.core.language.actionspec.file.ACT2GFileType;
import nl.tudelft.intelligoal.core.language.mas.file.MAS2GFileType;
import nl.tudelft.intelligoal.core.language.module.file.MOD2GFileType;
import nl.tudelft.intelligoal.core.language.prolog.file.PrologFileType;
import nl.tudelft.intelligoal.core.language.test.file.TEST2GFileType;
import org.jetbrains.annotations.NotNull;

public class GoalFileFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(MAS2GFileType.INSTANCE, "mas2g");
        consumer.consume(ACT2GFileType.INSTANCE, "act2g");
        consumer.consume(PrologFileType.INSTANCE, "pl");
        consumer.consume(MOD2GFileType.INSTANCE, "mod2g");
        consumer.consume(TEST2GFileType.INSTANCE, "test2g");
    }
}
