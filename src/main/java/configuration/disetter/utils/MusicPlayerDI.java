package configuration.disetter.utils;

import configuration.disetter.utils.music.MusicDI;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@NoArgsConstructor
public class MusicPlayerDI {
    private MusicDI music;
    private String name;
    private int volume;

    public MusicPlayerDI(MusicDI music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "  + music.getSong());
    }
}
