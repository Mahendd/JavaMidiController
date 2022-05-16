package actuators;

public abstract class Button extends Actuator{
    boolean currentState, lastState;
    int lowValue, highValue;

    public Button(int typeAndChannel, int number, int lowValue, int highValue) {
        super(typeAndChannel, number);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }
}
