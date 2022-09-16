package configuration.disetter.utils.music;

public class KPOPMusicDI implements MusicDI {
    String music = "Thunderous";
    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "KPOPMusicDI{" + music +"}\n";
    }
}
