package configuration.javaconfiguration.inappconfig.utils.music;

import lombok.ToString;

@ToString
public class RockMusicI implements MusicI {

    @Override
    public String getSong() {
        return "Eye of the tiger";
    }
}
