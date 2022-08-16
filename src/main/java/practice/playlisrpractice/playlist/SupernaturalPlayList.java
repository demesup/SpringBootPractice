package practice.playlisrpractice.playlist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SupernaturalPlayList implements Playlist {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Eye of the tiger");
        songs.add("Carry on my wayward son");
        songs.add("Highway to hell");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}
