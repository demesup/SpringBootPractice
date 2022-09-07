package iocanddi;

import iocanddi.utils.MusicPlayer;
import iocanddi.utils.music.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "IOCandDIappContext.xml"
        );
//        inversionOfControl(context);
        dependencyInjection(context);

        context.close();
    }

    private static void dependencyInjection(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//
        player.playMusic();
    }

    private static void inversionOfControl(ClassPathXmlApplicationContext context) {
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer player =new MusicPlayer(music);
        player.playMusic();

        context.close();
    }
}
