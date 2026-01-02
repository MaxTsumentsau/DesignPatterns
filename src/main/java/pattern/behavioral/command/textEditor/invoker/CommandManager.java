package pattern.behavioral.command.textEditor.invoker;

import pattern.behavioral.command.textEditor.commandInterface.Command;

import java.util.Stack;

public class CommandManager {
    private Stack<Command> history = new Stack<>();
    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undoLast(){
        if(!history.empty()){
            history.pop().undo();
        }
    }
}
