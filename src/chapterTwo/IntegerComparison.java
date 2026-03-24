import java.util.Scanner;

public class IntegerComparison {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int firstInteger = scanner.nextInt();

		System.out.print("Enter second integer: ");
		int secondInteger = scanner.nextInt();
		scanner.close();

		if (firstInteger == secondInteger)
			System.out.println("These numbers are equal");

		if (firstInteger > secondInteger)
			System.out.printf("%d is larger", firstInteger);

		if (firstInteger < secondInteger)
			System.out.printf("%d is larger", secondInteger);
	}
}