package weekTwo.dayTwo.tv;

public class Tv {
    private String name;
    private boolean isOn;
    private int volume;
    private int channel;

    public Tv(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        volume = 1;
        channel = 1;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public void increaseVolume() {
        if (isOn && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (isOn && volume > 0) {
            volume--;
        }
    }

    public void changeChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 10) {
            channel = newChannel;
        }
    }
}
