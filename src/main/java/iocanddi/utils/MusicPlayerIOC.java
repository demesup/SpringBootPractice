package iocanddi.utils;

import iocanddi.utils.music.MusicIOC;

public class MusicPlayerIOC {
    private MusicIOC music;

    public MusicPlayerIOC(MusicIOC music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "  + music.getSong());
    }
}
