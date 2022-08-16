package practice.dependencyinjection.music;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic factoryMethod() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("initialisation");
    }

    public void destroy() {
        System.out.println("Destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
