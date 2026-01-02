package pattern.behavioral.command.gui.invoker;

import pattern.behavioral.command.gui.commandInterface.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
