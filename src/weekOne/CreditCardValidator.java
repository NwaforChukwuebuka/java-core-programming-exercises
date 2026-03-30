package weekOne;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Card details to verify");
        String cardNumber = scanner.nextLine().trim();

        if (cardNumber.isEmpty()) {
            System.out.println("Invalid input: Card number cannot be empty.");
            return;
        }

        String cardType = getCardType(cardNumber);
        boolean isValid = validateCardNumber(cardNumber);
        int length = cardNumber.length();
        System.out.println("**Credit Card Type: " + cardType);
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + length);
        System.out.println("**Credit Card Validity Status: " + (isValid ? "Valid" : "Invalid"));
    }

    public static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa Card";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express Card";
        } else if (cardNumber.startsWith("6")) {
            return "Discover Card";
        } else {
            return "Invalid Card";
        }
    }

    public static boolean validateCardNumber(String cardNumber) {
        int length = cardNumber.length();
        if (length < 13 || length > 16) {
            return false;
        }

        int sumOfDoubleEven = sumOfDoubleEvenPlace(cardNumber);
        int sumOfOdd = sumOfOddPlace(cardNumber);
        int totalSum = sumOfDoubleEven + sumOfOdd;

        return totalSum % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(String cardNumber) {
        int sum = 0;
        for (int i = cardNumber.length() - 2; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    public static int sumOfOddPlace(String cardNumber) {
        int sum = 0;
        for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            sum += digit;
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }
        return (number / 10) + (number % 10);
    }
}
