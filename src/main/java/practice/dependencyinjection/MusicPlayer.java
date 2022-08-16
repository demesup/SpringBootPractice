package practice.dependencyinjection;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import practice.dependencyinjection.music.Music;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Component
public class MusicPlayer {
    private String name;
    private int volume;

//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;
//
//    public void playMusic(){
//        System.out.println(music.getSong());
//    }

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("edgyMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

    /**can use 2 fields
     private ClassicalMusic classicalMusic;
     private RockMusic rockMusic;

     @Autowired public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
     this.classicalMusic = classicalMusic;
     this.rockMusic = rockMusic;
     musicList.add(classicalMusic);
     musicList.add(rockMusic);
     }

     public void playMusic() {
     System.out.println(classicalMusic.getSong());
     System.out.println(rockMusic.getSong());
     }

     public String getMusic() {
     return classicalMusic.getSong();
     }*/

    /**
     * @Autowired can be above constructor, setter or field
     * public MusicPlayer(ClassicalMusic music) {
     * this.music = music;
     * }
     * @Autowired public void setMusic(ClassicalMusic music) {
     * this.music = music;
     * }
     */

    private List<Music> musicList = new ArrayList<>();

    public String playMusicList() {
        StringBuilder builder = new StringBuilder();
        musicList.forEach(music -> builder.append("Playing ").append(music.getSong()));

        return String.valueOf(builder);
    }
}
