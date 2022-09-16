package configuration.iocanddi.utils.music;

public class ClassicalMusicIOC implements MusicIOC {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
