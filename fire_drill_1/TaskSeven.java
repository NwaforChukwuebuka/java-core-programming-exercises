public class TaskSeven{

	public static void main(String[] args){

	
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
		System.out.printf("%d ",sum);
		System.out.printf(" ");
	}
    }
  }
}