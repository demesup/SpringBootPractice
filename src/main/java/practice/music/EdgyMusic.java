package practice.music;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class EdgyMusic implements Music {

    @Override
    public String getSong() {
        return "Good boy gone bad";
    }
}
