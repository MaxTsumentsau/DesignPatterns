package pattern.structural.adapter.audioplayer.adapter;

import pattern.structural.adapter.audioplayer.incompatibleClass.OldAudioPlayer;
import pattern.structural.adapter.audioplayer.newInterface.AudioPlayer;

public class Runner {
    public static void main(String[] args) {
        AudioPlayer player1 = new AudioAdapter(new OldAudioPlayer());
        player1.play("mp3", "Linkin Park - in the end.mp3");

        AudioPlayer player2 = new AudioClassAdapter();
        player2.play("mp4", "Architects - Doomsday.mp4");
    }
}
