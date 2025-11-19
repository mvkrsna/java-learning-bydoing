package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // sum of squares of even numbers
        // even numbers: 2,4,6 filter
        // squares: 4,16,36 map
        // sum: 56 reduce
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // even Numbers
                .map(n -> n * n) // squares
                .reduce(0, (a, b) -> a + b) // Sum
                ;
        System.out.println(" Sum Of Squares of Even Numbers: " + sum);

    }
}
