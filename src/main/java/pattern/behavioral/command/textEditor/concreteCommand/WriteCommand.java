package pattern.behavioral.command.textEditor.concreteCommand;

import pattern.behavioral.command.textEditor.commandInterface.Command;
import pattern.behavioral.command.textEditor.receiver.TextEditor;

public class WriteCommand implements Command {
    private TextEditor editor;
    private String words;

    public WriteCommand(TextEditor editor, String words) {
        this.editor = editor;
        this.words = words;
    }

    @Override
    public void execute() {
        editor.write(words);
    }

    @Override
    public void undo() {
        editor.deleteLast(words.length());
    }
}
