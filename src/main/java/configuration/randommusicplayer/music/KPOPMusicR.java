package configuration.randommusicplayer.music;

public class KPOPMusicR implements MusicR {
    String music;

    public KPOPMusicR(String music) {
        this.music = music;
    }

    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "KPOPMusicR{" + music +"}\n";
    }
}
