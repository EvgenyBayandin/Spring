package com;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    @Qualifier("danceMusic") // укажи id bean который нужно внедрить
    private Music music;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("danceMusic") Music music, @Qualifier("rockMusic") Music music2, @Qualifier("classicalMusic") Music music3) {
        this.music = music;
        this.music2 = music2;
        this.music3 = music2;
    }

    public String playMusic() {
        return "Playing song: " + music.getSong() + ", " + music2.getSong() + ", " + music3.getSong();
    }

}
