package configuration.disetter.utils.music;

public class RockMusicDI implements MusicDI {
    String music = "Eye of the tiger";
    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "RockMusicDI{" + music +"}\n";
    }
}
