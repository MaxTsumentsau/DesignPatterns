package pattern.structural.adapter.audioplayer.adapter;

import pattern.structural.adapter.audioplayer.incompatibleClass.OldAudioPlayer;
import pattern.structural.adapter.audioplayer.newInterface.AudioPlayer;

public class AudioAdapter implements AudioPlayer {
    private OldAudioPlayer oldAudioPlayer;

    public AudioAdapter(OldAudioPlayer oldAudioPlayer) {
        this.oldAudioPlayer = oldAudioPlayer;
    }

    @Override
    public void play(String type, String file) {
        if ("mp3".equalsIgnoreCase(type)) {
            oldAudioPlayer.playFile(file);
        } else System.out.printf("That type %s is incompatible.%n", type);
    }
}
