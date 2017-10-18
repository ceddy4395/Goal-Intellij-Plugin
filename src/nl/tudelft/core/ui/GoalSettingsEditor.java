package nl.tudelft.core.ui;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import nl.tudelft.core.language.GoalRunConfiguration;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoalSettingsEditor extends SettingsEditor<GoalRunConfiguration> {

    private JPanel myPanel;
    private LabeledComponent<ComponentWithBrowseButton> myMainClass;

    @Override
    protected void resetEditorFrom(@NotNull GoalRunConfiguration s) {

    }

    @Override
    protected void applyEditorTo(@NotNull GoalRunConfiguration s) throws ConfigurationException {

    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }

    private void createUIComponents() {
        myMainClass = new LabeledComponent<ComponentWithBrowseButton>();
        myMainClass.setComponent(new TextFieldWithBrowseButton());
    }
}
