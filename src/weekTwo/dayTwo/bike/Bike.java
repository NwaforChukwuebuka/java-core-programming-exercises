package weekTwo.dayTwo.bike;

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
        if(!poweredOn) return;
        speed += 1;

    }

    public int getGear() {
        if (speed <= 20) return 1;
        if (speed <= 30) return 2;
        if (speed <= 40) return 3;
        return 4;
    }
}
