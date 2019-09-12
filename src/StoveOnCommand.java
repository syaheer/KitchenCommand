
public class StoveOnCommand implements Command {
    Stove stove;

    public StoveOnCommand(Stove stove) {
        this.stove = stove;
    }

    public void execute() {
        stove.on();
    }

    public void undo() {
        stove.off();
    }
}
