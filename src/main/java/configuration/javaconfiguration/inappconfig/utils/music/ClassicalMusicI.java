package configuration.javaconfiguration.inappconfig.utils.music;

import lombok.ToString;

@ToString
public class ClassicalMusicI implements MusicI {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
