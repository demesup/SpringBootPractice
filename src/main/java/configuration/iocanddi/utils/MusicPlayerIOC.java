package configuration.iocanddi.utils;

import configuration.iocanddi.utils.music.MusicIOC;

public class MusicPlayerIOC {
    private final MusicIOC music;

    public MusicPlayerIOC(MusicIOC music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "  + music.getSong());
    }
}
