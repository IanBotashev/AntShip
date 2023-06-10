import java.awt.Color;
import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class SingleShip extends BasicSpaceship {
    // Name of ship to use.
    private final String name;

    // For testing purposes.
    public static void main(String[] args) {
        new SingleShip("antship", "127.0.1.1");
    }

    public SingleShip(String name, String ip) {
        this.name = name;
        TextClient.run(ip, this);
    }

    @Override
    public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight) {
        return new RegistrationData(name, new Color(255, 255, 255), 0);
    }

    @Override
    public ShipCommand getNextCommand(BasicEnvironment env) {
        return new IdleCommand(0.1);
    }
}