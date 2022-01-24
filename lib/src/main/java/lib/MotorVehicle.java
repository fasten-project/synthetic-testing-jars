package lib;

public interface MotorVehicle {
    boolean on();
    boolean off();

    void addDirt();
    int getDirtLevel();
    void setDirtLevel(int i);
}
