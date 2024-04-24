package com;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class MusicPlayer {
    private Music music;


    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(com.Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing song: " + music.getSong());
    }

}
