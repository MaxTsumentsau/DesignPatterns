package pattern.structural.bridge.remoteControl;

import pattern.structural.bridge.remoteControl.abstraction.Remote;
import pattern.structural.bridge.remoteControl.concreteAbstraction.BasicRemote;
import pattern.structural.bridge.remoteControl.concreteEmplementation.Radio;
import pattern.structural.bridge.remoteControl.concreteEmplementation.TV;

public class Runner {
    public static void main(String[] args) {
        Remote tvRemote = new BasicRemote(new TV());
        Remote radioRemote = new BasicRemote(new Radio());

        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.togglePower();

        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeDown();
        radioRemote.togglePower();
    }
}
