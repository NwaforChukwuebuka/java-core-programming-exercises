package ChapterTen;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public static List<Integer> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number <= 1) {
            return factors;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static List<Integer> getDivide(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number <= 1) {
            return factors;
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

}
