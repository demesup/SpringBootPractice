package annotations.utils.music;

import org.springframework.stereotype.Component;

@Component("kpopMusicA")
public class KPOPMusicA implements MusicA {
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
