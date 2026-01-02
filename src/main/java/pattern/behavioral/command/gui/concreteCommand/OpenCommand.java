package pattern.behavioral.command.gui.concreteCommand;

import pattern.behavioral.command.gui.commandInterface.Command;
import pattern.behavioral.command.gui.receiver.FileSystem;

public class OpenCommand implements Command {
    private FileSystem system;

    public OpenCommand(FileSystem system) {
        this.system = system;
    }

    @Override
    public void execute() {
        system.openFile();
    }
}
