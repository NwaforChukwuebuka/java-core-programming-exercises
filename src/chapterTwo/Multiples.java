import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = sc.nextInt();

        int tripledFirstNumber = 3 * firstNumber;
        int doubledSecondNumber = 2 * secondNumber;

         if (tripledFirstNumber % doubledSecondNumber == 0) {
            System.out.printf("%d is a multiple of %d.%n",tripledFirstNumber, doubledSecondNumber);}
        if (tripledFirstNumber % doubledSecondNumber != 0) {
            System.out.printf("%d is not a multiple of %d.%n",tripledFirstNumber, doubledSecondNumber);}

        sc.close();
    }
}