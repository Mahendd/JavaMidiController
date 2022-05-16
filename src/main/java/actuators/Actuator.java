package actuators;

public abstract class Actuator {
    int typeAndChannel; // Typically 176 for pots on channel 0
    int number; // 20 to 31 are undefined

    public Actuator(int typeAndChannel, int number) {
        this.number = number;
        this.typeAndChannel = typeAndChannel;
    }

    public abstract void run();
}
