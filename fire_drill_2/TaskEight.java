import java.util.Scanner;

public class TaskEight{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	float sum = 0;
	int count = 0;
	while(count < 10) {
		System.out.printf("Enter Score: ");
		float num = sc.nextFloat();		
		if (0 <= num && num <=100 ) {
			sum += num;
			count++;
		}
		else {
        		System.out.println("Enter a valid number: ");
    		}

	}
	System.out.printf("sum: %f\n", sum);
    }
  }