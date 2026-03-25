package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void setup() {
        bike = new Bike();
    }

    @Test
    @DisplayName("Bike can be turned ON")
    public void BikeCanBeTurnedOn() {
        bike.powerOn();
        assertTrue(bike.isBikePoweredOn());
    }

    @Test
    @DisplayName("Bike can be turned OFF")
    public void BikeCanBeTurnedOff() {
        bike.powerOn();
        bike.powerOff();
        assertTrue(bike.isBikePoweredOff());
    }

    @Test
    @DisplayName("Bike Starts with Zero Speed")
    void bikeStartsWithZeroSpeed() {
        assertEquals(0, bike.getSpeed());
    }
}
