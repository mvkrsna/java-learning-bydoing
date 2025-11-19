package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;

public class SumOrProductOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        int sumWithReduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sumWithReduce " + sumWithReduce);

        ///  SumOf Even Numbers Only
        int sumOfEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sumOfEvenNumbers " + sumOfEvenNumbers);

        int productOfNumbersWithReduce = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("productOfNumbers " + productOfNumbersWithReduce);

        int productOfNumbersWithMapToInt = numbers.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);
        System.out.println("productOfNumbersWithMapToInt " + productOfNumbersWithMapToInt);
    }
}
