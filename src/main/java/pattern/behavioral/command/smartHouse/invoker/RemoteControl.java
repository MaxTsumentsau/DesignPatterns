package pattern.behavioral.command.smartHouse.invoker;

import pattern.behavioral.command.smartHouse.commandInterface.Command;

import java.util.Stack;

public class RemoteControl {
    private Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (!history.empty()) {
            history.pop().undo();
        }
    }
}
