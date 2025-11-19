package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLengthOfEachOccurrence {
    // Write a Java program that demonstrates how to group a list of strings by their length
    // and count the number of occurrences of each length using Java Streams API.

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList(
                "Apple",
                "Banana",
                "Cherry",
                "Date",
                "Elderberry",
                "Fig",
                "Grape"
        );
        Map<Integer, List<String>> result = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.length()));

        System.out.println(result);
    }
}
