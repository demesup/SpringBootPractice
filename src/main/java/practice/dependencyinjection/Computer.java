package practice.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private final MusicPlayer player;

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
