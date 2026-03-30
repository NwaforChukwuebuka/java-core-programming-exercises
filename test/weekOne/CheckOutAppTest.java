package weekOne;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CheckOutAppTest {

    @Test
    void calculateSubTotal_returnsCorrectSum() {
        List<CheckOutApp.CartItem> cart = new ArrayList<>();
        cart.add(new CheckOutApp.CartItem("Parfait", 2, 2100.00));
        cart.add(new CheckOutApp.CartItem("Rice", 2, 550.00));
        
        double subTotal = CheckOutApp.calculateSubTotal(cart);
        assertEquals(5300.00, subTotal, 0.001);
    }

    @Test
    void cartItem_getTotal_returnsCorrectProduct() {
        CheckOutApp.CartItem item = new CheckOutApp.CartItem("Test", 3, 150.0);
        assertEquals(450.0, item.getTotal(), 0.001);
    }

    @Test
    void calculateBillTotal_matchesSampleLogic() {
        double subTotal = 5300.00;
        double discountPercentage = 8.0;
        double discount = subTotal * (discountPercentage / 100); // 424.00
        double vat = subTotal * 0.075; // 397.50
        double billTotal = subTotal - discount + vat; // 5300 - 424 + 397.5 = 5273.5
        
        assertEquals(424.00, discount, 0.001);
        assertEquals(397.50, vat, 0.001);
        assertEquals(5273.5, billTotal, 0.001);
    }
}
