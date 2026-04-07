package weekFour.snacks;

public class DivideAlgorithm {
    public static int GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(int first, int second) {
        int count = 0;
        if(second < 0) return -1;
        if( first < 1 ) {
            first = Math.abs(first);
            while(first >= second){
                first -= second;
                count++;
            }
            return -count;
        }
        else {
            while(first >= second){
                first -= second;
                count++;
            }
            return count;
        }

    }
}
