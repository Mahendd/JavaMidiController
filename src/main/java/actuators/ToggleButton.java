package actuators;

import java.awt.*;

public class ToggleButton extends Button {
    boolean toggleState;

    public ToggleButton(int typeAndChannel, int number, int lowValue, int highValue) {
        super(typeAndChannel, number, lowValue, highValue);
    }

    @Override
    public void run() {

    }
}
