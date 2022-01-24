package app;

import lib.MotorVehicle;
import lib.VehicleWash;

public class RoadTrip {

    private final VehicleWash vw;

    public RoadTrip(VehicleWash vw) {
        this.vw = vw;
    }

    public void doRoadTrip(MotorVehicle v) {
        v.on();
        vw.wash(v);
        v.off();
    }
}