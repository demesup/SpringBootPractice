package configuration.annotations.utils.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusicA implements MusicA {
    String music = "Eye of the tiger";
    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "RockMusicR{" + music +"}\n";
    }
}
