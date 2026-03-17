import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number % 2 == 1)
			System.out.printf("%d is odd", number);
		if (number % 2 == 0)
			System.out.printf("%d is even", number);


	}
}