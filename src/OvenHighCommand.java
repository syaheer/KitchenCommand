/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class OvenHighCommand implements Command {
    Oven oven;
    int prevTemperature;

    OvenHighCommand(Oven oven) {
        this.oven = oven;
    }

    public void execute() {
        prevTemperature = oven.getTemperature();
        oven.high();
    }

    public void undo() {
        switch (prevTemperature) {
            case Oven.HIGH:
                oven.high();
                break;
            case Oven.MEDIUM:
                oven.medium();
                break;
            case Oven.LOW:
                oven.low();
                break;
            case Oven.OFF:
                oven.off();
                break;
        }
    }
}
