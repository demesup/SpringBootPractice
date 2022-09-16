package configuration.javaconfiguration.inappconfig.utils.music;

import lombok.ToString;
@ToString
public class KPOPMusicI implements MusicI {
    String music = "Thunderous";
    @Override
    public String getSong() {
        return music;
    }
}
