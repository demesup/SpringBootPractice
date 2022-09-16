package configuration.iocanddi.utils.music;

public class RockMusicIOC implements MusicIOC {

    @Override
    public String getSong() {
        return "Eye of the tiger";
    }
}
