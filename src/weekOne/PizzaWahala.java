package weekOne;

import java.util.Scanner;

public class PizzaWahala {
    private static final String[] PIZZA_NAMES = {"Sapa size", "Small Money", "Big boys", "Odogwu"};
    private static final int[] SLICES_PER_BOX = {4, 6, 8, 12};
    private static final int[] PRICE_PER_BOX = {2500, 2900, 4000, 5200};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pizza types available:");
        for (int i = 0; i < PIZZA_NAMES.length; i++) {
            System.out.printf("%d. %s (%d slices per box, %d per box)%n",
                    (i + 1), PIZZA_NAMES[i], SLICES_PER_BOX[i], PRICE_PER_BOX[i]);
        }
        System.out.print("Enter Pizza type (name or number): ");
        String userInput = scanner.nextLine();

        int selectedIndex = findPizzaIndex(userInput, PIZZA_NAMES);

        if (selectedIndex == -1) {
            System.out.println("Invalid pizza type.");
            return;
        }

        int slicesPerBox = SLICES_PER_BOX[selectedIndex];
        int pricePerBox = PRICE_PER_BOX[selectedIndex];

        int boxes = calculateBoxes(numberOfPeople, slicesPerBox);
        int leftovers = calculateLeftovers(numberOfPeople, slicesPerBox, boxes);
        long totalPrice = calculateTotalPrice(boxes, pricePerBox);

        System.out.println("\nNumber of boxes of pizza to buy = " + boxes + " boxes");
        System.out.println("Number left over slices after serving = " + leftovers + " slices");
        System.out.println("Price = " + totalPrice);
    }

    public static int findPizzaIndex(String userInput, String[] pizzaNames) {
        String normalizedInput = userInput.toLowerCase();
        for (int i = 0; i < pizzaNames.length; i++) {
            if (normalizedInput.contains(pizzaNames[i].toLowerCase()) || normalizedInput.equals(String.valueOf(i + 1))) {
                return i;
            }
        }
        return -1;
    }

    public static int calculateBoxes(int guests, int slicesPerBox) {
        if (slicesPerBox == 0) return 0;
        return (int) Math.ceil((double) guests / slicesPerBox);
    }

    public static int calculateLeftovers(int guests, int slicesPerBox, int boxes) {
        return (boxes * slicesPerBox) - guests;
    }

    public static long calculateTotalPrice(int boxes, int pricePerBox) {
        return (long) boxes * pricePerBox;
    }
}
