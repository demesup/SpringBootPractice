package disetter.utils;

import disetter.utils.music.MusicDI;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@ToString
@NoArgsConstructor
public class MusicListPlayer {

    private List<MusicDI> musicDIList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicListPlayer(MusicDI music) {
        this.musicDIList.add(music);
    }

    public void playMusic(){
        StringBuilder builder = new StringBuilder().append("Playing: \n");
        musicDIList.forEach(builder::append);
        System.out.println(builder);
    }

}
