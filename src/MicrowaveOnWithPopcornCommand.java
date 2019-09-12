/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class MicrowaveOnWithPopcornCommand implements Command {
    Microwave microwave;

    public MicrowaveOnWithPopcornCommand(Microwave microwave) {
        this.microwave = microwave;
    }

    public void execute() {
        microwave.on();
        microwave.setPopcorn();
        microwave.setTime(2);
    }

    public void undo() {
        microwave.off();
    }
}
