package annotations;

import annotations.utils.Computer;
import annotations.utils.MusicPlayerA;
import annotations.utils.music.MusicA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationAppContext.xml"
        );
//        component(context);
//        autowired(context);
        computer(context);
        context.close();
    }

    private static void computer(ClassPathXmlApplicationContext context) {
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
    }

    private static void autowired(ClassPathXmlApplicationContext context) {
        MusicPlayerA playerQ = context.getBean("musicPlayerQ", MusicPlayerA.class);
        playerQ.playMusic();
    }

    private static void component(ClassPathXmlApplicationContext context) {
        MusicA musicA = context.getBean("classicalMusicQ", MusicA.class);
        MusicA musicA1 = context.getBean("rockMusicQ", MusicA.class);

//        MusicPlayerQ playerQ = new MusicPlayerQ(musicA);
//        MusicPlayerQ playerQ1 = new MusicPlayerQ(musicA1);
//
//        playerQ.playMusic();
//        playerQ1.playMusic();
    }
}
