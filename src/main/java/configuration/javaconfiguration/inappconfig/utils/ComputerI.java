package configuration.javaconfiguration.inappconfig.utils;

public class ComputerI {
    private final int id;
    private final MusicPlayerI musicPlayer;

    public ComputerI(MusicPlayerI musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=\n" + musicPlayer.getMusic() +
                '}';
    }
}
