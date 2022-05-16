package controllerServices;

import actuators.Actuator;
import actuators.PushButton;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bank implements Iterable<Actuator> {
    public ArrayList<Actuator> actuators;

    public Bank () {}
    public Bank (ArrayList<Actuator> actuators) {
        this.actuators = actuators;
    }

    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    @Override
    public Iterator<Actuator> iterator() {
        return actuators.iterator();
    }

    @Override
    public void forEach(Consumer<? super Actuator> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Actuator> spliterator() {
        return Iterable.super.spliterator();
    }
}
