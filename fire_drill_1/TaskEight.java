public class TaskEight{

	public static void main(String[] args){

	int total =0;
	for (int i = 0; i++ < 10;) {
	
	if (i % 4 == 0) {
		int mul = 1;
		int j= 0;
		int sum = 0;
		while (j < 5) {
		mul = mul * i;
		j++;
		sum += mul;
		}
		total += sum;
	}
	
    }
	System.out.printf("%d",total);
  }
}