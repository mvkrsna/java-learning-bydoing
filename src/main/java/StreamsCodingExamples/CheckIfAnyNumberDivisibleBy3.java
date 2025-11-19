package StreamsCodingExamples;

import java.util.List;
import java.util.stream.Collectors;

public class CheckIfAnyNumberDivisibleBy3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(25, 4, 24, 19, 18, 7, 12, 5, 9);
        boolean anyDivisibleBy3 = numbers.stream()
                .anyMatch(num -> num % 3 == 0);
        System.out.println(anyDivisibleBy3 ? "There is at least one number divisible by 3." : "No numbers are divisible by 3.");

        List<Integer> numsDivisibleByThree = numbers.stream().filter(num -> num % 3 == 0).toList();
        System.out.println("Numbers divisible by 3: " + numsDivisibleByThree);

        List<Integer> evenNumbersdivisibleBythree = numbers.stream().filter(num -> num % 3 == 0)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbersdivisibleBythree);

    }
}
