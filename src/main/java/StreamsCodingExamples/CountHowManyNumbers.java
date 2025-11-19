package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountHowManyNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 8, 23, 2, 6);
        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println(count);

        List<Integer> numbersGreaterThan5 =
                numbers
                        .stream()
                        .filter(n -> n > 5)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(numbersGreaterThan5);
    }
}
