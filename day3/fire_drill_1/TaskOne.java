import java.util.Scanner;
import java.lang.Math;
public class TaskOne{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.printf("Enter First Number: ");
	int firstNum = sc.nextInt();

	System.out.printf("Enter First Number: ");
	int secondNum = sc.nextInt();
	if (firstNum < 0 && secondNum < 0) {
		if(secondNum < 0) {secondNum = -secondNum;}
		if(firstNum < 0) {firstNum = -firstNum;}
	  	for (int i = 1; i <= secondNum; i++) {
		sum += firstNum;
		} 
	}
	else if (firstNum < 0 || secondNum < 0) {
		secondNum = Math.abs(secondNum);
		firstNum = Math.abs(firstNum);
	  	for (int i = 1; i <= secondNum; i++) {
		sum += firstNum;
		} 
		sum = -sum;
	}
	else if(firstNum > 0 && secondNum > 0) {
		for (int i = 1; i <= secondNum; i++) {
		sum += firstNum;
		}
	}
	else {
	  sum = 0;
	} 
	System.out.printf("%d x %d = %d ", firstNum, secondNum,sum);
    }
  }