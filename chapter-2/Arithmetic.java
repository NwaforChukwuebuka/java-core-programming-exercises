import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int sumOfSquares, diffOfSquares;

		System.out.print("Enter first integer: ");
		firstNumber = input.nextInt();
        System.out.print("Enter second integer: ");
		secondNumber = input.nextInt();
        input.close();

        sumOfSquares = (firstNumber * firstNumber) + (secondNumber * secondNumber);
        diffOfSquares = (firstNumber * firstNumber) - (secondNumber * secondNumber) ;
        

		System.out.printf("Sum of squares is %d%n", sumOfSquares);
		System.out.printf("Difference of squares is %d%n", diffOfSquares);
	}
}