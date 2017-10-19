package nl.tudelft.core.language.Syntax;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import nl.tudelft.core.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class GoalColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", GoalSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", GoalSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", GoalSyntaxHighlighter.VALUE)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.MOD2G;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new GoalSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return null;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Goal";
    }
}
