package pattern.behavioral.command.gui;

import pattern.behavioral.command.gui.concreteCommand.ExitCommand;
import pattern.behavioral.command.gui.concreteCommand.OpenCommand;
import pattern.behavioral.command.gui.concreteCommand.SaveCommand;
import pattern.behavioral.command.gui.invoker.Button;
import pattern.behavioral.command.gui.receiver.FileSystem;

public class Runner {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        Button saveButton = new Button(new SaveCommand(fileSystem));
        Button openButton = new Button(new OpenCommand(fileSystem));
        Button exitButton = new Button(new ExitCommand(fileSystem));

        saveButton.click();
        openButton.click();
        exitButton.click();
    }
}
