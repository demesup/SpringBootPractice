package music;

import lombok.ToString;

@ToString
public class EdgyMusic implements Music {

    @Override
    public String getSong() {
        return "Good boy gone bad";
    }
}
