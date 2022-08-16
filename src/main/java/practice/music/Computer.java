package practice.music;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer player;

    public Computer(MusicPlayer player) {
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
//        return "Computer " + id + " " + player.getMusic.getSong();
        return "Computer " + id + " " + player.playMusic();
    }
}
