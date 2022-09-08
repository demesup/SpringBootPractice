package randommusicplayer.music;

public class ClassicalMusicR implements MusicR {
    String music;

    public ClassicalMusicR(String music) {
        this.music = music;
    }

    @Override
    public String getSong() {
        return music;
    }

    @Override
    public String toString() {
        return "ClassicalMusicR{" + music +"}\n";
    }
}
