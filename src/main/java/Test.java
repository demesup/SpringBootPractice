import music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer);
        System.out.println(musicPlayer1.hashCode()+" "+ musicPlayer.hashCode());

        musicPlayer.setVolume(5);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());

        musicPlayer.playMusic();
        System.out.println(musicPlayer);
    }
}
