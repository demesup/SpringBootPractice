package configuration.annotations.utils;

import configuration.annotations.utils.music.MusicA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {

    private final MusicA musicA1;
    private final MusicA musicA2;


    @Autowired
    public MusicPlayerA(
            @Qualifier("kpopMusicA") MusicA musicA1,
                        @Qualifier("rockMusicA") MusicA musicA2) {
        this.musicA1 = musicA1;
        this.musicA2 = musicA2;
    }

    public void playMusic() {
        System.out.println("Playing: " + "\n" + playlist());
    }

    public String playlist() {
        return musicA1.getSong() + "\n" + musicA2.getSong();
    }
}
