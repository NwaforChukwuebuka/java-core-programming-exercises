package lcm;

public class LowestCommonMultiples {
    private int x = 2;
    private int lcm = 1;

    public int getLcm(int number) {
        while (number > 1){

            if (number % x == 0) {
                number /= x;
            }
            else {
                x++;
                continue;
            }
            lcm *= x;
        };
        return lcm;
    }


    public int getLcm(int num1, int num2) {

        while (num1 > 1 & num2 > 1){

            if (num1 % x == 0) {
                num1 /= x;
            } else if (num2 % x == 0) {
                num2 /= x;

            } else {
                x++;
                continue;
            }
            lcm *= x;
        };
        return lcm;
    }

    public int getLcm(int num1, int num2, int num3) {
        while (num1 > 1 & num2 > 1 & num3 > 1){

            if (num1 % x == 0) {
                num1 /= x;
            } else if (num2 % x == 0) {
                num2 /= x;

            } else if (num3 % x == 0) {
                num3 /= x;

            }
            else {
                x++;
                continue;
            }
            lcm *= x;
        };
        return lcm;

    }

    public int getLcm(int[] numArray) {

        for(int i = 0; numArray[i] > 1 ; i++){

            if (numArray[i] % x == 0) {
                numArray[i] /= x;
            }
            else {
                x++;
                continue;
            }
            lcm *= x;
        };
        return lcm;
    }
}
