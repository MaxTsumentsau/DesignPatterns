package pattern.structural.adapter.audioplayer.incompatibleClass;

public class OldAudioPlayer {
    public void playFile(String file) {
        System.out.printf("This file %s is playing!%n", file);
    }
}
