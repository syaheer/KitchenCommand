
public class Main {

    public static void main(String[] args) {

        // Kitchen Switch
        KitchenSwitch remoteControl = new KitchenSwitch();
        Microwave microwave = new Microwave();
        Oven oven = new Oven(Oven.HIGH);
        Stove stove = new Stove();

        MicrowaveOnCommand microwaveOn =
                new MicrowaveOnCommand(microwave);
        MicrowaveOffCommand microwaveOff =
                new MicrowaveOffCommand(microwave);

        OvenHighCommand ovenHigh =
                new OvenHighCommand(oven);
        OvenMediumCommand ovenMedium =
                new OvenMediumCommand(oven);
        OvenLowCommand ovenLow =
                new OvenLowCommand(oven);
        OvenOffCommand ovenOff =
                new OvenOffCommand(oven);

        StoveOnCommand stoveOn =
                new StoveOnCommand(stove);
        StoveOnWithHighHeatCommand stoveOnWithHighHeat =
                new StoveOnWithHighHeatCommand(stove);
        StoveOnWithLowHeatCommand stoveOnWithLowHeat =
                new StoveOnWithLowHeatCommand(stove);
        StoveOffCommand stoveOff =
                new StoveOffCommand(stove);

        remoteControl.setCommand(0, microwaveOn, microwaveOff);
        remoteControl.setCommand(1, ovenHigh, ovenOff);
        remoteControl.setCommand(2, ovenMedium, ovenOff);
        remoteControl.setCommand(3, ovenLow, ovenOff);
        remoteControl.setCommand(4, stoveOn, stoveOff);
        remoteControl.setCommand(5, stoveOnWithHighHeat, stoveOff);
        remoteControl.setCommand(6, stoveOnWithLowHeat, stoveOff);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);

        // Kitchen switch with undo
        KitchenSwitchWithUndo kitchenSwitchWithUndo = new KitchenSwitchWithUndo();
        kitchenSwitchWithUndo.setCommand(0, stoveOn, stoveOff);
        kitchenSwitchWithUndo.onButtonWasPushed(0);
        kitchenSwitchWithUndo.offButtonWasPushed(0);
        System.out.println(kitchenSwitchWithUndo);
        kitchenSwitchWithUndo.undoButtonWasPushed();
        kitchenSwitchWithUndo.offButtonWasPushed(0);
        kitchenSwitchWithUndo.onButtonWasPushed(0);
        System.out.println(kitchenSwitchWithUndo);
        kitchenSwitchWithUndo.undoButtonWasPushed();
    }

}
