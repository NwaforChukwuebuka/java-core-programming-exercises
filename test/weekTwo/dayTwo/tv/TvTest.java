package weekTwo.dayTwo.tv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvTest {
    private Tv tv;

    @BeforeEach
    void setUp() {
        tv = new Tv("LG");
    }

    @Test
    void should_beOn_when_turnedOn() {
        assertFalse(tv.isOn());
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    void should_setVolumeAndChannelToOne_when_turnedOn() {
        tv.turnOn();
        assertEquals(1, tv.getVolume());
        assertEquals(1, tv.getChannel());
    }

    @Test
    void should_increaseVolume_when_increased() {
        tv.turnOn();
        assertEquals(1, tv.getVolume());
        tv.increaseVolume();
        assertEquals(2, tv.getVolume());
    }

    @Test
    void should_decreaseVolume_when_decreased() {
        tv.turnOn();
        tv.increaseVolume();
        assertEquals(2, tv.getVolume());
        tv.decreaseVolume();
        assertEquals(1, tv.getVolume());
    }

    @Test
    void should_stayAtZero_when_decreasedAtMinimum() {
        tv.turnOn();
        assertEquals(1, tv.getVolume());
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());
    }

    @Test
    void should_stayAt100_when_increasedAtMaximum() {
        tv.turnOn();
        for (int i = 1; i <= 99; i++) {
            tv.increaseVolume();
        }
        assertEquals(100, tv.getVolume());
        tv.increaseVolume();
        assertEquals(100, tv.getVolume());
    }

    @Test
    void should_changeChannel_when_validChannelIsEntered() {
        tv.turnOn();
        assertEquals(1, tv.getChannel());
        tv.changeChannel(5);
        assertEquals(5, tv.getChannel());
    }

    @Test
    void should_notChangeChannel_when_channelAboveTenIsEntered() {
        tv.turnOn();
        assertEquals(1, tv.getChannel());
        tv.changeChannel(11);
        assertEquals(1, tv.getChannel());
    }

    @Test
    void should_notChangeChannel_when_channelBelowOneIsEntered() {
        tv.turnOn();
        assertEquals(1, tv.getChannel());
        tv.changeChannel(0);
        assertEquals(1, tv.getChannel());
    }
}
