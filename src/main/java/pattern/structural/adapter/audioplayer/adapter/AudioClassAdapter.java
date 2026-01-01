package pattern.structural.adapter.audioplayer.adapter;

import pattern.structural.adapter.audioplayer.incompatibleClass.OldAudioPlayer;
import pattern.structural.adapter.audioplayer.newInterface.AudioPlayer;

public class AudioClassAdapter extends OldAudioPlayer implements AudioPlayer {
    @Override
    public void play(String type, String file) {
        if ("mp3".equalsIgnoreCase(type)) {
            super.playFile(file);
        } else System.out.printf("That type %s is incompatible.%n", type);
    }
}
