package configuration.javaconfiguration.inappconfig;

import configuration.javaconfiguration.inappconfig.utils.MusicPlayerI;
import configuration.javaconfiguration.inappconfig.utils.music.ClassicalMusicI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfigurationI.class
        );

        MusicPlayerI player = context.getBean("musicPlayerI", MusicPlayerI.class);

        System.out.println(player.getVolume() +"\n" + player.getName());
        player.playMusic();

        System.out.println(
                context.getBean("classicalMusicI", ClassicalMusicI.class) ==
                        context.getBean("classicalMusicI", ClassicalMusicI.class)
        );
        context.close();
    }
}
