package configuration.javaconfiguration.inappconfig.utils;

import configuration.javaconfiguration.inappconfig.utils.music.MusicI;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

@Getter
public class MusicPlayerI {
    private final List<MusicI> music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayerI(List<MusicI> music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.get(new Random().nextInt(music.size())).getSong());
    }
}
