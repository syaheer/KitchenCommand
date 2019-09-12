/**
 * Created by MuhamadSyahirAmir on 9/11/2019.
 */
public class Oven {
    static final int HIGH = 3;
    static final int MEDIUM = 2;
    static final int LOW = 1;
    static final int OFF = 0;
    private int temperature;

    public Oven(int initialTemp) {
        this.temperature = initialTemp;
    }

    void high() {
        temperature = HIGH;
        System.out.println("Oven is on high");
        // code to set temperature to high
    }
    void medium() {
        temperature = MEDIUM;
        System.out.println("Oven is on medium");
        // code to set temperature to medium
    }
    void low() {
        temperature = LOW;
        System.out.println("Oven is on low");
        // code to set temperature to low
    }

    void off() {
        temperature = OFF;
        System.out.println("Oven is off");
        // code to turn temperature off
    }

    int getTemperature() {
        return temperature;
    }
}
