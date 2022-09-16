package configuration.javaconfiguration.auto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("configuration.javaconfiguration")
@PropertySource("classpath:musicPlayer.properties")
public class AppConfiguration {

}
