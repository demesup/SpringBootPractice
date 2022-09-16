package configuration.javaconfiguration.auto;

import configuration.javaconfiguration.auto.utils.MusicPlayer;
import configuration.javaconfiguration.auto.utils.music.ClassicalMusic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfiguration.class
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player.getName() + " " + player.getVolume());

        System.out.println(
                context.getBean("classicalMusic", ClassicalMusic.class) ==
                        context.getBean("classicalMusic", ClassicalMusic.class)
        );
        context.close();
    }
}
