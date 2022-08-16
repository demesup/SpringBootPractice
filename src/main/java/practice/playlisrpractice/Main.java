package practice.playlisrpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.playlisrpractice.playlist.Genre;

/**
 * List of songs(3 songs for each genre)
 * Enum with genre names
 * playMusic(Enum enum)
 * By the enum value play Random song of genre
 * */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("playlistContext.xml");
        PlaylistPlayer player = context.getBean("playlistPlayer", PlaylistPlayer.class);
        player.playMusic(Genre.KPOP);
        player.playMusic(Genre.KPOP);
        player.playMusic(Genre.KPOP);
        player.playMusic(Genre.SUPERNATURAL);
        player.playMusic(Genre.SUPERNATURAL);
        player.playMusic(Genre.SUPERNATURAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
        player.playMusic(Genre.CLASSICAL);
    }
}
