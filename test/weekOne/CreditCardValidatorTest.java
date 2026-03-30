package weekOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    void getCardType_returnsCorrectType() {
        assertEquals("Visa Card", CreditCardValidator.getCardType("4388576018402626"));
        assertEquals("MasterCard", CreditCardValidator.getCardType("5399831619690403"));
        assertEquals("American Express Card", CreditCardValidator.getCardType("370000000000000"));
        assertEquals("Discover Card", CreditCardValidator.getCardType("6011000000000000"));
        assertEquals("Invalid Card", CreditCardValidator.getCardType("123456789012345"));
    }

    @Test
    void sumOfDoubleEvenPlace_calculatesCorrectly() {
        assertEquals(37, CreditCardValidator.sumOfDoubleEvenPlace("4388576018402626"));
    }

    @Test
    void sumOfOddPlace_calculatesCorrectly() {
        assertEquals(38, CreditCardValidator.sumOfOddPlace("4388576018402626"));
    }

    @Test
    void validateCardNumber_identifiesInvalidCard() {
        assertFalse(CreditCardValidator.validateCardNumber("4388576018402626"));
    }

    @Test
    void validateCardNumber_identifiesValidCard() {
        assertTrue(CreditCardValidator.validateCardNumber("4388576018410707"));
    }
}
