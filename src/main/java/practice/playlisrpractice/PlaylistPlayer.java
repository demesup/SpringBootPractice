package practice.playlisrpractice;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import practice.playlisrpractice.playlist.ClassicalPlaylist;
import practice.playlisrpractice.playlist.Genre;
import practice.playlisrpractice.playlist.KpopPlaylist;
import practice.playlisrpractice.playlist.SupernaturalPlayList;

import java.util.Random;

@Component
public class PlaylistPlayer {
    private final ClassicalPlaylist classicalPlaylist;
    private final KpopPlaylist kpopPlaylist;
    private final SupernaturalPlayList supernaturalPlayList;

    @Autowired
    public PlaylistPlayer(ClassicalPlaylist classicalPlaylist, KpopPlaylist kpopPlaylist, SupernaturalPlayList supernaturalPlayList) {
        this.classicalPlaylist = classicalPlaylist;
        this.kpopPlaylist = kpopPlaylist;
        this.supernaturalPlayList = supernaturalPlayList;
    }

    @SneakyThrows
    public void playMusic(Genre genre) {
        int index = new Random().nextInt(3);
        String song;
        switch (genre) {
            case CLASSICAL -> song = classicalPlaylist.getSongs().get(index);
            case KPOP -> song = kpopPlaylist.getSongs().get(index);
            case SUPERNATURAL -> song = supernaturalPlayList.getSongs().get(index);
            default -> throw new Exception("Not an enum");
        }
        System.out.println(song);
    }
}
