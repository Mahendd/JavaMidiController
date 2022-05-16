package actuators;

public class PushButton extends Button {
    int highValue, lowValue;

    public PushButton(int typeAndChannel, int number, int lowValue, int highValue) {
        super(typeAndChannel, number, lowValue, highValue);
    }

    @Override
    public void run() {

    }
}
