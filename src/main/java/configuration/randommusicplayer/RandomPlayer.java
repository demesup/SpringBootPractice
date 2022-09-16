package configuration.randommusicplayer;

import configuration.randommusicplayer.music.*;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component("random")
@NoArgsConstructor
public class RandomPlayer {

    List<SupernaturalMusicR> supernaturalMusic = List.of(
            new SupernaturalMusicR("Eye of the tiger"),
            new SupernaturalMusicR("Carry on my wayward son"),
            new SupernaturalMusicR("highway to Hell"));
    List<ClassicalMusicR> classicalMusic = List.of(
            new ClassicalMusicR("The Four Seasons"),
            new ClassicalMusicR("The Valkyrie: Ride of the Valkyries"),
            new ClassicalMusicR("Pomp and Circumstance"));
    List<KPOPMusicR> kpopMusic = List.of(
            new KPOPMusicR("Good boy gone bad"),
            new KPOPMusicR("Not today"),
            new KPOPMusicR("Venom"));

    public void playMusic(Choice choice) {
        List<? extends MusicR> list;
        switch (choice) {
            case KPOP -> list = kpopMusic;
            case CLASSICAL -> list = classicalMusic;
            case SUPERNATURAL -> list = supernaturalMusic;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        MusicR song = list.get(new Random().nextInt(list.size()));
        System.out.println("Playing" + song);
    }
}

