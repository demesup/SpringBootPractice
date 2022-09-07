package disetter;

import disetter.utils.MusicListPlayer;
import disetter.utils.MusicPlayerDI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "diAppContext.xml"
        );

        musicPlayer(context);
        musicListPlayer(context);
        context.close();
    }

    private static void musicListPlayer(ClassPathXmlApplicationContext context) {
        MusicListPlayer player = context.getBean("musicListPlayer", MusicListPlayer.class);
        player.playMusic();
    }

    private static void musicPlayer(ClassPathXmlApplicationContext context) {
        MusicPlayerDI player = context.getBean("musicPlayer", MusicPlayerDI.class);

        player.playMusic();
        System.out.println(player);
    }
}
