package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 28, 2, 239, 19);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .sorted()
                .findFirst();
        System.out.println(result.get());
//        result.ifPresent(System.out::println);
    }
}
