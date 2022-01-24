public class BasicMotorVehicle implements MotorVehicle {

    public boolean on() {
        System.out.println("Basic vehicle is started!");
        return true;
    }

    public boolean off() {
        System.out.println("Turned off the basic vehicle!");
        return true;
    }
}
