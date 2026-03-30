package weekTwo.dayTwo.ac;
                                                             
import org.junit.jupiter.api.Test;
                                                             
import static org.junit.jupiter.api.Assertions.*;
                                                             
class AcTest {
                                                             
                                                             
    @Test
    void should_beOff_when_new() {
        Ac ac = new Ac();
        assertFalse(ac.isOn());
    }

    @Test
    void should_beOn_when_turnedOn() {
        Ac ac = new Ac();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    void should_haveTemperature17_when_increasedOnceFromDefault() {
        Ac ac = new Ac();
        ac.turnOn();
        assertEquals(16, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    void should_stayAt16_when_decreasedToMinimum() {
        Ac ac = new Ac();
        ac.turnOn();
        assertEquals(16, ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
