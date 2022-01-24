public class MotorCycle extends BasicMotorVehicle{
    int speed;

    public MotorCycle() {
        this.speed = 0;
    }

    public int accelerate(){
        speed ++;
        System.out.println("Current speed is: "+ speed);
        return this.speed;
    }

    public static void main(String[] args) {
        var motor = new MotorCycle();
        motor.on();
        motor.accelerate();
        motor.off();
    }
}
