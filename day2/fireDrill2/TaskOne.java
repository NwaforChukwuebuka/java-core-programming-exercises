import java.util.Scanner;

public class TaskOne{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int sum = 0;
	for (int i = 0; i++ < 10;) {
		System.out.printf("Enter Score: ");
		float num = sc.nextFloat();
		sum += num;
	}
	System.out.printf("Total Score: %d", sum);
    }
  }