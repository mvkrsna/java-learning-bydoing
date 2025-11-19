package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbersInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2);

        List<Integer> numbers1 = List.of(1, 2);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }
}
