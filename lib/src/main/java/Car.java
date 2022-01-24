public class Car implements MotorVehicle {
    public boolean on() {
        System.out.println("The car is started!");
        return true;
    }

    public boolean off() {
        System.out.println("Turned off the car!");
        return true;
    }

    public static void main(String[] args) {
        var car = new Car();
        car.on();
        car.off();
    }
}
