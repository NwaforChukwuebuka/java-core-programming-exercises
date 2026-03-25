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
    public void bikeCanBeTurnedOn() {
        bike.powerOn();
        assertTrue(bike.isBikePoweredOn());
    }

    @Test
    @DisplayName("Bike can be turned OFF")
    public void bikeCanBeTurnedOff() {
        bike.powerOn();
        bike.powerOff();
        assertTrue(bike.isBikePoweredOff());
    }

    @Test
    @DisplayName("Bike Starts with Zero Speed")
    void bikeStartsWithZeroSpeed() {
        assertEquals(0, bike.getSpeed());
    }

    @Test
    @DisplayName("Bike accelerates with increment of 1 in Gear 1")
    void bikeAcceleratesBy1InGearOne() {
        bike.powerOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    void bikeAcceleratesMultipleTimesInGearOne() {
        bike.powerOn();
        for (int i = 0; i < 10; i++)
        {
            bike.accelerate();
        }

        assertEquals(10, bike.getSpeed());
    }

    @Test
    @DisplayName("Bike switch from Gear 1 to Gear 2")
    void bikeSwitchFromGearOneToGearTwo() {
        bike.powerOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }

        bike.accelerate();

        assertEquals(2, bike.getGear());
    }

}

