package music;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();
    public void playMusic(){
        musicList.forEach(music -> System.out.println("Playing " + music.getSong()));
    }

    public MusicPlayer(Music music) {
        musicList.add(music);
    }
}
