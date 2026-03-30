package weekOne;

import java.util.ArrayList;
import java.util.List;

public class ArrayKata {

    public int maximumIn(int[] numbers) {
        if (numbers.length == 0) return 0;
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public int minimumIn(int[] numbers) {
        if (numbers.length == 0) return 0;
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }

    public int sumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) sum += number;
        }
        return sum;
    }

    public int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) sum += number;
        }
        return sum;
    }

    public int[] maximumAndMinimumOf(int[] numbers) {
        if (numbers.length == 0) return new int[]{0, 0};
        return new int[]{minimumIn(numbers), maximumIn(numbers)};
    }

    public int noOfOddNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count++;
        }
        return count;
    }

    public int noOfEvenNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) count++;
        }
        return count;
    }

    public int[] evenNumbersIn(int[] numbers) {
        int count = noOfEvenNumbersIn(numbers);
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index++] = number;
            }
        }
        return evenNumbers;
    }

    public int[] oddNumbersIn(int[] numbers) {
        int count = noOfOddNumbersIn(numbers);
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[index++] = number;
            }
        }
        return oddNumbers;
    }

    public int[] squareNumbersIn(int[] numbers) {
        List<Integer> squareNumbersList = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) {
                int root = (int) Math.sqrt(number);
                if (root * root == number) {
                    squareNumbersList.add(number);
                }
            }
        }
        int[] squareNumbers = new int[squareNumbersList.size()];
        for (int i = 0; i < squareNumbersList.size(); i++) {
            squareNumbers[i] = squareNumbersList.get(i);
        }
        return squareNumbers;
    }
}
