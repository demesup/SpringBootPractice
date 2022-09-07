package disetter.utils.music;

public class ClassicalMusicDI implements MusicDI {
    String music = "Hungarian Rapsody";
    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "ClassicalMusicDI{" + music +"}\n";
    }
}
