package actuators;

public class Potentiometer extends Actuator {
    int minValue, maxValue;  // From analogRead()
    int minOutput, maxOutput; // Typically 0-127
    int currentState, lastState;
    int threshold;  // Minimum variation required to send signal
    boolean reverse;   // If true, abs(value - 127) -> 0 goes to 127, 127 goes to 0 etc
    int mappedCurrentState, mappedLastState; // Value compensated for min_output to max_output

    public Potentiometer(int typeAndChannel, int number) {
        super(typeAndChannel, number);
    }

    @Override
    public void run() {

    }
}
