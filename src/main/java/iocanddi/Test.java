package iocanddi;

import iocanddi.utils.MusicPlayerIOC;
import iocanddi.utils.music.MusicIOC;
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
        MusicPlayerIOC player = context.getBean("musicPlayer", MusicPlayerIOC.class);

        player.playMusic();
    }

    private static void inversionOfControl(ClassPathXmlApplicationContext context) {
        MusicIOC music = context.getBean("musicBean", MusicIOC.class);
        MusicPlayerIOC player =new MusicPlayerIOC(music);
        player.playMusic();

        context.close();
    }
}
