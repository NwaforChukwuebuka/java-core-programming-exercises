package zone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZoneCheckerTest {
    @Test
    @DisplayName("Enugu should return South East")
    public void EnuguFallUnderSouthEast() {
        ZoneChecker checker = new ZoneChecker();

        assertEquals("South East", checker.getZone("Enugu"));
    }

    @Test
    @DisplayName("Kano should return North West")
    public void KanoFallUnderNorthWest() {
        ZoneChecker checker = new ZoneChecker();

        assertEquals("North West", checker.getZone("Kano"));
    }
}
