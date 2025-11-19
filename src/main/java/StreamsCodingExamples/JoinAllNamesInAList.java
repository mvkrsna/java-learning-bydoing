package StreamsCodingExamples;

import java.util.List;
import java.util.stream.Collectors;

public class JoinAllNamesInAList {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Annie", "Charlie", "David", "Amanda");
        // join all names in a list -- use joining
        String collectedAsString = names.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("Collected Names in String format is: " + collectedAsString);
    }
}
