package app;

import lib.BasicMotorVehicle;

public class MotorCycle extends BasicMotorVehicle {

    public void kickStandUp() {
        System.out.println("Kickstand up");
    }

    public void kickStandDown() {
        System.out.println("Kickstand down");
    }

    @Override
    public String getName() {
        return "MotorCycle";
    }
}
