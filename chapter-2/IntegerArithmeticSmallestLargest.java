import java.util.Scanner;

public class IntegerArithmeticSmallestAndLargest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstInteger = input.nextInt();

		System.out.print("Enter second integer: ");
		int secondInteger = input.nextInt();

		System.out.print("Enter third integer: ");
		int thirdInteger = input.nextInt();
		input.close();

		int sum = firstInteger + secondInteger + thirdInteger;
		int avg = sum / 3;
		int product = firstInteger * secondInteger * thirdInteger;

		int largest = firstInteger;
		if (secondInteger > largest)
			largest = secondInteger;
		if (thirdInteger > largest)
			largest = thirdInteger;

		int smallest = firstInteger;
		if (secondInteger < smallest)
			smallest = secondInteger;
		if (thirdInteger < smallest)
			smallest = thirdInteger;

		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Average is %d%n", avg);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Largest is %d%n", largest);
		System.out.printf("Smallest is %d%n", smallest);
	}
}