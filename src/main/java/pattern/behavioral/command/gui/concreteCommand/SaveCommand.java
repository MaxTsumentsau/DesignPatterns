package pattern.behavioral.command.gui.concreteCommand;

import pattern.behavioral.command.gui.commandInterface.Command;
import pattern.behavioral.command.gui.receiver.FileSystem;

public class SaveCommand implements Command {
    private FileSystem system;

    public SaveCommand(FileSystem system) {
        this.system = system;
    }

    @Override
    public void execute() {
        system.saveFile();
    }
}
