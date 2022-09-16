package configuration.javaconfiguration.auto.utils.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Eye of the tiger";
    }
}
