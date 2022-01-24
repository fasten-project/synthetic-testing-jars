package lib;

public abstract class BasicMotorVehicle implements MotorVehicle {

    public abstract String getName();

    public boolean on() {
        System.out.printf("%s is started!\n", getName());
        return true;
    }

    public boolean off() {
        System.out.printf("Turned off %s!\n", getName());
        return true;
    }

    private int dirtLevel;

    @Override
    public void addDirt() {
        dirtLevel++;
    }

    @Override
    public int getDirtLevel() {
        return dirtLevel;
    }

    @Override
    public void setDirtLevel(int dirtLevel) {
        this.dirtLevel = dirtLevel;
    }
}
