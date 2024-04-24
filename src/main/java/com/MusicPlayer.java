package com;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("danceMusic") // укажи id bean который нужно внедрить
    private Music music;



    public String playMusic() {
        return "Playing song: " + music.getSong();
    }

}
