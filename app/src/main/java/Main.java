import app.Car;
import app.MotorCycle;
import app.RoadTrip;
import lib.VehicleWash;

public class Main {

    public final VehicleWash vehicleWash = new VehicleWash();
    public final RoadTrip trip = new RoadTrip(vehicleWash);

    public static void main(String[] args) {
        var m = new Main();
        m.doCarStuff();
        m.doMotorCycleStuff();
    }

    public void doCarStuff() {
        var car = new Car();
        car.addtoTrunk("drinks");
        trip.doRoadTrip(car);
        var trunk = car.getTrunk();
    }

    public void doMotorCycleStuff() {
        var mc = new MotorCycle();
        mc.kickStandUp();
        trip.doRoadTrip(mc);
        mc.kickStandDown();
    }
}