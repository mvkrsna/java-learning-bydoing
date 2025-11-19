package StreamsCodingExamples;

import java.util.List;

public class CountHowManyStringsWithA {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Annie", "Charlie", "David", "Amanda");
        // string should start with A -- filter
        // how many strings are there -- count
        List<String> namesStartingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(" Names starting with A: " + namesStartingWithA);
        System.out.println("count of Strings starting with A: " + namesStartingWithA.size());
    }
}
