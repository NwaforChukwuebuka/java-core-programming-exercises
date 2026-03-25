package bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void setup() {
        bike = new Bike();
    }

    @Test
    @DisplayName("Test bike can be turned on")
    public void testBikeCanBeTurnedOn() {
        bike.powerOn();
        assertTrue(bike.isBikePoweredOn());
    }
}
