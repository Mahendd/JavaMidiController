package controllerServices;

import actuators.Actuator;

import java.util.ArrayList;

public class Controller {
    ArrayList<Bank> banks;
    int currentBank;

    public Controller (ArrayList<Bank> banks) {
        this.banks = banks;
    }

    public void actuate() {
        for (Actuator actuator : banks.get(currentBank)) {
            actuator.run();
        }
    }
}
