import java.util.Scanner;

public class TaskSeven{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	float sum = 0;
	int count = 0;
	float avg = 0;
	for (int i = 0; i++ < 10;) {
		System.out.printf("Enter Score: ");
		float num = sc.nextFloat();
		if (num % 2 == 0) {
		count++;
		sum += num;
		}
	}
	avg = sum/count;
	System.out.printf("sum: %f\n", sum);
	System.out.printf("Average: %f", avg);
    }
  }