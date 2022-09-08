package randommusicplayer.music;

public class SupernaturalMusicR implements MusicR {
    String music;

    public SupernaturalMusicR(String music) {
        this.music = music;
    }

    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "SupernaturalMusicR{" + music +"}\n";
    }
}
