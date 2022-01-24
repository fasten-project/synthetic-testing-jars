package app;

import java.util.LinkedList;
import java.util.List;
import lib.BasicMotorVehicle;
import lib.MotorVehicle;

public class Car extends BasicMotorVehicle {

    private final List<String> trunk = new LinkedList<>();

    @Override
    public String getName() {
        return "Car";
    }

    public void addtoTrunk(String item) {
        trunk.add(item);
    }

    public List<String> getTrunk() {
        final var contents = new LinkedList<>(this.trunk);
        this.trunk.clear();
        return contents;
    }
}
