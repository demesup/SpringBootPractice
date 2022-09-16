package configuration.annotations.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private final MusicPlayerA musicPlayerA;

    @Autowired
    public Computer(MusicPlayerA musicPlayerA) {
        this.musicPlayerA = musicPlayerA;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayerQ=\n" + musicPlayerA.playlist() +
                '}';
    }
}
