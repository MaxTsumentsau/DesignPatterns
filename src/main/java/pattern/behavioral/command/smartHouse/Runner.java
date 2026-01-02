package pattern.behavioral.command.smartHouse;

import pattern.behavioral.command.smartHouse.concreteCommand.ACOnCommand;
import pattern.behavioral.command.smartHouse.concreteCommand.LightOnCommand;
import pattern.behavioral.command.smartHouse.concreteCommand.MusicOnCommand;
import pattern.behavioral.command.smartHouse.invoker.RemoteControl;
import pattern.behavioral.command.smartHouse.receiver.AirConditioner;
import pattern.behavioral.command.smartHouse.receiver.Light;
import pattern.behavioral.command.smartHouse.receiver.MusicSystem;

public class Runner {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Light light = new Light();
        MusicSystem musicSystem = new MusicSystem();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.pressButton(new LightOnCommand(light));
        remoteControl.pressButton(new ACOnCommand(ac));
        remoteControl.pressButton(new MusicOnCommand(musicSystem));

        remoteControl.pressUndo();
        remoteControl.pressUndo();
    }
}
