package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();
        System.out.println(squaredNumbers);
    }
}
