import java.util.Scanner;

public class TaskTen{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	float sum = 0;
	int count = 0;
	float average;
	while(count < 10) {
		System.out.printf("Enter Score: ");
		float num = sc.nextFloat();		
		if (0 <= num && num <=100 ) {
			sum += num;
			count++;
		}
	}
	average = sum/count;
	System.out.printf("Average: %f\n", average);
    }
  }