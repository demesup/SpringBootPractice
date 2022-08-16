package practice;

import practice.music.ClassicalMusic;
import practice.music.Computer;
import practice.music.Music;
import practice.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        testInitDestroy(context);
//        testPlayer(context);
//        testComponent(context);
//        autowired(context);
        testComputer(context);


        context.close();
    }

    private static void testComputer(ClassPathXmlApplicationContext context) {
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }

    private static void autowired(ClassPathXmlApplicationContext context) {
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }

    private static void testComponent(ClassPathXmlApplicationContext context) {
        Music music = context.getBean("musicBean", Music.class);
        Music music1 = context.getBean("classicalMusic", Music.class);

//        MusicPlayer player = new MusicPlayer(music);
//        MusicPlayer player1 = new MusicPlayer(music1);
//
//        player.playMusic();
//        player1.playMusic();
    }

    private static void testInitDestroy(ClassPathXmlApplicationContext context) {
        System.out.println("testInitDestroySingleton");

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
    }

    private static void testPlayer(ClassPathXmlApplicationContext context) {
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer);
        System.out.println(musicPlayer1.hashCode() + " " + musicPlayer.hashCode());

        musicPlayer.setVolume(5);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());

        musicPlayer.playMusic();
        System.out.println(musicPlayer);
    }
}
