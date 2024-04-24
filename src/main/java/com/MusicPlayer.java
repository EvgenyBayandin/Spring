package com;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class MusicPlayer {
    private DanceMusic danceMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(DanceMusic danceMusic, RockMusic rockMusic) {
        this.danceMusic = danceMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Playing song: " + danceMusic.getSong());
        System.out.println("Playing song: " + rockMusic.getSong());
    }

}
