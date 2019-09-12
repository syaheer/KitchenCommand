/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class MicrowaveOnCommand implements Command{
    Microwave microwave;

    public MicrowaveOnCommand(Microwave microwave) {
        this.microwave = microwave;
    }

    public void execute() {
        microwave.on();
    }

    public void undo() {
        microwave.off();
    }
}
