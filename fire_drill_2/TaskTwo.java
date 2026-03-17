import java.util.Scanner;

public class TaskTwo{

	public static void main(String[] args){
	float average;
	Scanner sc = new Scanner(System.in);
	float sum = 0;
	for (int i = 0; i++ < 10;) {
		System.out.printf("Enter Score: ");
		Float num = sc.nextFloat();
		sum += num;
	}
	System.out.printf("Average Score: %f", sum/10);
    }
  }