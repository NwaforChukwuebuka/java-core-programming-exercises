import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number % 3  == 0)
			System.out.printf("%d is divisible by 3", number);
		if (number % 3 == 1)
			System.out.printf("%d is not divisible by 3", number);
		if (number % 3 == 2)
			System.out.printf("%d is not divisible by 3", number);



	}
}