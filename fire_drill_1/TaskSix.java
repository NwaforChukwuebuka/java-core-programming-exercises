public class TaskSix{

	public static void main(String[] args){

	
	for (int i = 0; i++ < 10;) {
	if (i % 4 == 0) {
		int mul = i;
		int j = 0;
		while (j < 5) {
		System.out.printf("%d ",mul);
		mul = mul * i;
		j++;
		}
		System.out.printf(" ");
	}
    }
  }
}