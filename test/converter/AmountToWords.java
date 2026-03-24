package converter;

public class AmountToWords {

    public String convertAmountToWords (int amount) {
        if(amount % 1000000 >= 0) {
            return "One million";
        };
        return "";
    }
}
