package weekOne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckOutApp {

    public static class CartItem {
        public String name;
        public int quantity;
        public double price;

        public CartItem(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public double getTotal() {
            return (double) quantity * price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();

        System.out.println("What is the customer's Name");
        String customerName = scanner.nextLine();

        boolean addMore = true;
        while (addMore) {
            System.out.println("What did the user buy?");
            String itemName = scanner.nextLine();

            System.out.println("How many pieces?");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.println("How much per unit?");
            double price = Double.parseDouble(scanner.nextLine());

            cart.add(new CartItem(itemName, quantity, price));

            System.out.println("Add more Items?");
            String response = scanner.nextLine().toLowerCase();
            while (!response.equals("yes") && !response.equals("no")) {
                System.out.println("Add more Items? (yes/no)");
                response = scanner.nextLine().toLowerCase();
            }
            if (response.equals("no")) {
                addMore = false;
            }
        }

        System.out.println("What is your name?");
        String cashierName = scanner.nextLine();

        System.out.println("How much discount will he get");
        double discountPercentage = Double.parseDouble(scanner.nextLine());

        double subTotal = calculateSubTotal(cart);
        double discount = subTotal * (discountPercentage / 100);
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discount + vat;

        displayInvoice(customerName, cashierName, cart, subTotal, discount, vat, billTotal);
        System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + String.format("%.2f", billTotal));
        System.out.println("=====================================================");

        System.out.println("\nHow much did the customer give to you?");
        double amountPaid = Double.parseDouble(scanner.nextLine());

        displayInvoice(customerName, cashierName, cart, subTotal, discount, vat, billTotal);
        System.out.printf("Amount Paid:     %.2f%n", amountPaid);
        System.out.printf("Balance:         %.2f%n", amountPaid - billTotal);
        System.out.println("=====================================================");
        System.out.println("        THANK YOU FOR YOUR PATRONAGE");
        System.out.println("=====================================================");
    }

    public static void displayInvoice(String customerName, String cashierName, List<CartItem> cart, double subTotal, double discount, double vat, double billTotal) {
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + new java.text.SimpleDateFormat("dd-MMM-yy hh:mm:ss a").format(new Date()));
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("=====================================================");
        System.out.printf("%15s %5s %10s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-----------------------------------------------------");

        for (CartItem item : cart) {
            System.out.printf("%15s %5d %10.2f %15.2f%n", item.name, item.quantity, item.price, item.getTotal());
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%32s: %10.2f%n", "Sub Total", subTotal);
        System.out.printf("%32s: %10.2f%n", "Discount", discount);
        System.out.printf("%32s: %10.2f%n", "VAT @ 7.50%", vat);
        System.out.println("=====================================================");
        System.out.printf("%32s: %10.2f%n", "Bill Total", billTotal);
        System.out.println("=====================================================");
    }

    public static double calculateSubTotal(List<CartItem> cart) {
        double subTotal = 0;
        for (CartItem item : cart) {
            subTotal += item.getTotal();
        }
        return subTotal;
    }
}
