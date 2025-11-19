package StreamsCodingExamples;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllDistinctElementsInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 1, 6, 5, 3, 2, 8, 9, 1);

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctNumbers : " + distinctNumbers);
        // We can use Set, but the insertion Order is not preserved
        Set<Integer> distinctNumbersSet = new HashSet<>(numbers);
        System.out.println("distinctNumbersSet : " + distinctNumbersSet);

        // LinkedHashSet preserves the insertion order
        Set<Integer> distinctNumbersLinkedSet = new LinkedHashSet<>(numbers);
        System.out.println("distinctNumbersLinkedSet : " + distinctNumbersLinkedSet);
    }
}
