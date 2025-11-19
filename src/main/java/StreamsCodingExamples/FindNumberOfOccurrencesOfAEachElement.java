package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumberOfOccurrencesOfAEachElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "grapes"
        );

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        System.out.println(result);
    }
}
