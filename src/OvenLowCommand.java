/**
 * Created by MuhamadSyahirAmir on 9/12/2019.
 */
public class OvenLowCommand implements Command {
    Oven oven;
    int prevTemperature;

    public OvenLowCommand(Oven oven) {
        this.oven = oven;
    }

    public void execute() {
        prevTemperature = oven.getTemperature();
        oven.low();
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
