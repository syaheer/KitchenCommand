/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class StoveOffCommand implements Command {
    Stove stove;

    public StoveOffCommand(Stove stove) {
        this.stove = stove;
    }

    public void execute() {
        stove.off();
    }

    public void undo() {
        stove.on();
    }
}
