public class TaskSeven{

	public static void main(String[] args){

	
	for (int i = 0; i++ < 10;) {
	if (i % 4 == 0) {
		int mul = i;
		int j,sum = 0;
		while (j < 5) {
		System.out.printf("%d ",mul);
		mul = mul * i;
		j++;
		sum += mul;
		}
		System.out.printf(" ");
	}
    }
  }
}