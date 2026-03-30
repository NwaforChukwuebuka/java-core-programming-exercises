package weekOne;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class PizzaWahalaTest {

    @ParameterizedTest
    @CsvSource({
            "45, 12, 4, 3, 5200, 20800", 
            "10, 4, 3, 2, 2500, 7500",
            "15, 6, 3, 3, 2900, 8700",
            "20, 8, 3, 4, 4000, 12000"
    })
    void calculatePizzaRequirements_forVariousPizzaTypes_returnsCorrectResults(
            int numberOfPeople, int slicesPerBox, int expectedBoxes,
            int expectedLeftovers, int pricePerBox, long expectedTotalPrice) {

        int boxes = PizzaWahala.calculateBoxes(numberOfPeople, slicesPerBox);
        assertEquals(expectedBoxes, boxes, "Incorrect number of boxes for " + numberOfPeople + " people");

        int leftovers = PizzaWahala.calculateLeftovers(numberOfPeople, slicesPerBox, boxes);
        assertEquals(expectedLeftovers, leftovers, "Incorrect leftovers for " + numberOfPeople + " people");

        long totalPrice = PizzaWahala.calculateTotalPrice(boxes, pricePerBox);
        assertEquals(expectedTotalPrice, totalPrice, "Incorrect total price for " + boxes + " boxes");
    }

    @ParameterizedTest
    @CsvSource({
            "Odogwu, 3",
            "Sapa size, 0",
            "Small Money, 1",
            "Big boys, 2",
            "2, 1",
            "4, 3"
    })
    void findPizzaIndex_forValidInputs_returnsCorrectIndex(String input, int expectedIndex) {
        String[] pizzaNames = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int index = PizzaWahala.findPizzaIndex(input, pizzaNames);
        assertEquals(expectedIndex, index, "Incorrect index for input: " + input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Invalid", "5", "0", "None"})
    void findPizzaIndex_forInvalidInputs_returnsNegativeOne(String input) {
        String[] pizzaNames = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
        int index = PizzaWahala.findPizzaIndex(input, pizzaNames);
        assertEquals(-1, index, "Expected -1 for invalid input: " + input);
    }
}
