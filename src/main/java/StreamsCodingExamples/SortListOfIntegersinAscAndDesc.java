package StreamsCodingExamples;

import java.util.Comparator;
import java.util.List;

public class SortListOfIntegersinAscAndDesc {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(25, 4, 10, 5, 3, 585, 23, 87, 45, 12);
        System.out.println("Original List: " + numbers);
        // Sorting in Ascending Order
        List<Integer> sortedAsc = numbers.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println("Sorted in Ascending Order: " + sortedAsc);
        // Sorting in Descending Order
        List<Integer> sortedDesc = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted in Descending Order: " + sortedDesc);
    }
}
