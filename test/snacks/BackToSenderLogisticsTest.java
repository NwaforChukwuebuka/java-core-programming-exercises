package snacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BackToSenderLogisticsTest {

    private BackToSenderLogistics logistics;

    @BeforeEach
    public void setup() {
        logistics = new BackToSenderLogistics();
    }

    @Test
    @DisplayName("Test calculateRiderWage Function")
    public void testCalculateRiderWageFunction() {
        assertEquals(5480, logistics.calculateRiderWage(3));
        assertEquals(16000, logistics.calculateRiderWage(55));
        assertEquals(21250, logistics.calculateRiderWage(65));
        assertEquals(45000, logistics.calculateRiderWage(80));
    }

    @Test
    @DisplayName("Test calculateRiderWage Input Validation")
    public void testCalculateRiderWageInputValidation() {
        IllegalArgumentException tooLow = assertThrows(
                IllegalArgumentException.class, () -> logistics.calculateRiderWage(-1));
        assertEquals("Successful deliveries cannot be negative", tooLow.getMessage());

        IllegalArgumentException tooHigh = assertThrows(
                IllegalArgumentException.class, () -> logistics.calculateRiderWage(101));
        assertEquals(
                "Successful deliveries cannot exceed the daily quota of 100",
                tooHigh.getMessage());
    }
}
