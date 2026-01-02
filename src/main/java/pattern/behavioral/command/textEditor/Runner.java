package pattern.behavioral.command.textEditor;

import pattern.behavioral.command.textEditor.commandInterface.Command;
import pattern.behavioral.command.textEditor.concreteCommand.WriteCommand;
import pattern.behavioral.command.textEditor.invoker.CommandManager;
import pattern.behavioral.command.textEditor.receiver.TextEditor;

public class Runner {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager manager = new CommandManager();

        Command command1 = new WriteCommand(editor, "Hello");
        Command command2 = new WriteCommand(editor, " world!");

        manager.executeCommand(command1);
        manager.executeCommand(command2);
        System.out.println(editor.getText());

        manager.undoLast();
        System.out.println(editor.getText());
    }
}
