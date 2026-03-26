package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void openAccount_returnsAccountNumberTest() {
        assertEquals(1, bank.getAccountNumber());
    }

    @Test
    public void openTwoAccounts_returnsIncrementingAccountNumbersTest() {
        assertEquals(1, bank.getAccountNumber());
        assertEquals(2, bank.getAccountNumber());
    }

}
