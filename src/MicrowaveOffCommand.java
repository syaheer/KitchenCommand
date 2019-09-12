/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class MicrowaveOffCommand implements Command {
    Microwave microwave;

    public MicrowaveOffCommand(Microwave microwave) {
        this.microwave = microwave;
    }

    public void execute() {
        microwave.off();
    }

    public void undo() {
        microwave.on();
    }
}
