package bike;

public class Bike {
    private boolean poweredOn;
    private int speed = 0;

    public void powerOn() {
        poweredOn = true;
    }

    public boolean isBikePoweredOn() {
        return poweredOn;
    }

    public void powerOff() {
        poweredOn = false;
    }

    public boolean isBikePoweredOff() {
        return !poweredOn;
    }

    public int getSpeed() {
        return  speed;
    }

    public void accelerate() {
        speed += 1;
    }
}
