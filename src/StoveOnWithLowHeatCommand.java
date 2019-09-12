/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class StoveOnWithLowHeatCommand implements Command {
    Stove stove;

    public StoveOnWithLowHeatCommand(Stove stove) {
        this.stove = stove;
    }

    public void execute() {
        // low heat, fan does not need to be on
        stove.on();
        stove.setHeat(30);
    }

    public void undo() {
        stove.off();
    }
}
