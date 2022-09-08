package annotations.utils.music;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusicA implements MusicA {
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
