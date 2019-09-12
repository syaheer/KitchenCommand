/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class StoveOnWithHighHeatCommand implements Command {
    Stove stove;
    public StoveOnWithHighHeatCommand(Stove stove) {
        this.stove = stove;
    }

    public void execute() {
        // high heat, turn fan on
        stove.on();
        stove.turnOnFan();
        stove.setHeat(100);
    }

    public void undo() {
        stove.off();
    }
}
