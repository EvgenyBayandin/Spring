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

    public String playMusic() {
        return "Playing song: " + danceMusic.getSong();
    }

}
