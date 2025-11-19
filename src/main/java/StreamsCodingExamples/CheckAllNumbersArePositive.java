package StreamsCodingExamples;

import java.util.List;

public class CheckAllNumbersArePositive {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // check if all numbers are positive -- allMatch
        boolean allNumbersArePositive = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println(allNumbersArePositive);

        List<String> names = List.of("Alice", "Bo", "Annie", "Charlie", "David", "Amanda");
        // check if all names have length greater than 3 -- allMatch
        boolean isNameLengthGreaterThanThree = names.stream().allMatch(name -> name.length() > 3);
        System.out.println(isNameLengthGreaterThanThree);

        List<Integer> numbers2 = List.of(2, 4, 8, 6, 10, 12);
        // check if all numbers are even -- allMatch
        boolean allEven = numbers2.stream()
                .allMatch(num -> num % 2 == 0);
        System.out.println("allEven are: " + allEven);
    }
}
