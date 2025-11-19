package StreamsCodingExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 88, 22, 11, 44, 100, 76, 54, 32);

        // find a number -filter
        // find second highest Number - sorted, skip, find First

        List<Integer> sortedList = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
//                .findFirst();

        System.out.println(sortedList);

        Optional<Integer> resultNumber = numbers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        resultNumber.ifPresentOrElse(i -> System.out.println(i), () -> System.out.println("No second highest number found"));
    }
}
