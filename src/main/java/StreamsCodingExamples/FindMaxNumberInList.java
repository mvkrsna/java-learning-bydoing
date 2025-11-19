package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 28, 2, 239, 19);
        int max = numbers.stream()
                .reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println("maximum of numbers using reduce" + max);

        int maxWithMethodReference = numbers.stream()
                .reduce(0, Integer::max);
        System.out.println("maxWithMethodReference :" + maxWithMethodReference);
    }
}
