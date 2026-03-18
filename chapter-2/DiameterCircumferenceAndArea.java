import java.util.Scanner;

public class DiameterCircumferenceAndArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Radius of the Circle: ");
		int radius = sc.nextInt();
		sc.close();

		System.out.printf("Diameter =  %d%n", radius * 2);
		System.out.printf("Circumference =  %f%n", 2 * Math.PI * radius);
		System.out.printf("Area = %f%n", Math.PI * (radius * radius));
	}

}