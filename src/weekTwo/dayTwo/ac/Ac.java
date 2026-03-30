package weekTwo.dayTwo.ac;

public class Ac {
    private boolean isOn;
    private int temperature = 16;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
        }
    }
}
