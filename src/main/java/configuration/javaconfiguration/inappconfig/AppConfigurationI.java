package configuration.javaconfiguration.inappconfig;

import configuration.javaconfiguration.inappconfig.utils.ComputerI;
import configuration.javaconfiguration.inappconfig.utils.MusicPlayerI;
import configuration.javaconfiguration.inappconfig.utils.music.ClassicalMusicI;
import configuration.javaconfiguration.inappconfig.utils.music.KPOPMusicI;
import configuration.javaconfiguration.inappconfig.utils.music.RockMusicI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class AppConfigurationI {

    @Bean
    public ClassicalMusicI classicalMusicI() {
        return new ClassicalMusicI();
    }

    @Bean
    public RockMusicI rockMusicI() {
        return new RockMusicI();
    }

    @Bean
    public KPOPMusicI kpopMusicI() {
        return new KPOPMusicI();
    }

    @Bean
    public MusicPlayerI musicPlayerI() {
        return new MusicPlayerI(List.of(rockMusicI(), kpopMusicI(), classicalMusicI()));
    }

    @Bean
    public ComputerI computerI() {
        return new ComputerI(musicPlayerI());
    }
}
