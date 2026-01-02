package pattern.behavioral.command.smartHouse.concreteCommand;

import pattern.behavioral.command.smartHouse.commandInterface.Command;
import pattern.behavioral.command.smartHouse.receiver.AirConditioner;

public class ACOnCommand implements Command {
    private AirConditioner ac;

    @Override
    public void execute() {
        ac.on();
    }

    @Override
    public void undo() {
        ac.off();
    }

    public ACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }
}
