package nl.tudelft.intelligoal.core.ui;

import com.intellij.ide.util.TreeFileChooser;
import com.intellij.ide.util.TreeFileChooserDialog;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import nl.tudelft.intelligoal.core.language.mas.file.MAS2GFileType;
import nl.tudelft.intelligoal.core.RunConfiguration.GoalRunConfiguration;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoalSettingsEditor extends SettingsEditor<GoalRunConfiguration> {
    /**
     * The project this editor is configuring.
     */
    private final Project project;

    /**
     * The UI component to display as the form.
     */
    private final JPanel ui;

    /**
     * The text box containing the path to the MAS file.
     */
    private final TreeFileChooser fileChooser;

    /**
     * The text box containing the path to the file.
     */
    private final TextFieldWithBrowseButton fileBox;

    /**
     * Creates a new GOAL MAS configuration editor.
     *
     * @param project the project this editor is for
     */
    public GoalSettingsEditor(final @NotNull Project project) {
        this.project = project;
        this.ui = new JPanel();

        this.fileChooser = this.rebuildChooser(project);

        final JLabel fileLabel = new JLabel("File to run:");

        this.fileBox = new TextFieldWithBrowseButton.NoPathCompletion();
        this.fileBox.addActionListener(event -> this.fileChooser.showDialog());
        this.fileBox.setEditable(false);
        this.fileBox.setAlignmentX(0);
        this.fileBox.setAlignmentY(0);
        //this.fileBox.setEditable(true);

        this.ui.add(fileLabel);
        this.ui.add(this.fileBox);
    }

    private TreeFileChooser rebuildChooser(final @NotNull Project project) {
        final TreeFileChooserDialog dialog = new TreeFileChooserDialog(
                project, "Select a File", null, MAS2GFileType.INSTANCE, null,
                false, true
        );
        return dialog;
    }

    @Override
    protected void resetEditorFrom(final @NotNull GoalRunConfiguration s) {
        this.fileBox.setText("<no file selected>");
        if (s.getRunFile() != null) {
            final VirtualFile file = LocalFileSystem.getInstance().refreshAndFindFileByPath(s.getRunFile());

            if (file != null) {
                final PsiFile selectedFile = PsiManager.getInstance(this.project).findFile(file);

                if (selectedFile != null) {
                    this.fileChooser.selectFile(selectedFile);
                    this.fileBox.setText(s.getRunFile());
                }
            }
        }
    }

    @Override
    protected void applyEditorTo(final @NotNull GoalRunConfiguration s)
            throws ConfigurationException {
        if (this.fileChooser.getSelectedFile() == null) {
            throw new ConfigurationException("No selected.");
        }
        this.fileBox.setText(this.fileChooser.getSelectedFile().getVirtualFile().getPath());
        s.setRunFile(this.fileChooser.getSelectedFile().getVirtualFile().getPath());
    }

    /**
     * Returns the editor's UI component.
     *
     * @return the UI
     */
    @NotNull
    @Override
    protected JComponent createEditor() {
        return this.ui;
    }

}
