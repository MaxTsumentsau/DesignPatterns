package pattern.behavioral.command.smartHouse.concreteCommand;

import pattern.behavioral.command.smartHouse.commandInterface.Command;
import pattern.behavioral.command.smartHouse.receiver.MusicSystem;

public class MusicOnCommand implements Command {
    private MusicSystem musicSystem;

    public MusicOnCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void execute() {
        musicSystem.on();
    }

    @Override
    public void undo() {
        musicSystem.off();
    }
}
