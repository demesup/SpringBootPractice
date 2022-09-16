package configuration.randommusicplayer;

import configuration.randommusicplayer.music.Choice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationAppContext.xml"
        );

        RandomPlayer player =context.getBean("random", RandomPlayer.class);

        for (int i = 0; i < 20; i++) {
            Choice[] values = Choice.values();
            player.playMusic(values[new Random().nextInt(values.length)]);
        }
    }
}
