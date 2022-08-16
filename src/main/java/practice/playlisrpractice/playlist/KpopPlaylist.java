package practice.playlisrpractice.playlist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KpopPlaylist implements Playlist {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Good boy gone bad");
        songs.add("Red lights");
        songs.add("Mic drop");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
