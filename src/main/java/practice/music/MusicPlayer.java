package practice.music;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public void playMusic() {
        musicList.forEach(music -> System.out.println("Playing " + music.getSong()));
    }

    @Autowired
    public MusicPlayer(Music music) {
        musicList.add(music);
    }
}
