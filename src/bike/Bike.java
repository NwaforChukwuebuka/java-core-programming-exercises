package bike;

public class Bike {
    private boolean poweredOn;

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

}
