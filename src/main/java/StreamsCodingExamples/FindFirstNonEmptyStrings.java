package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyStrings {
    public static void main(String[] args) {
        List<String> emptyStrings = List.of("", "Hare", "krsna", "", "", "govind");
        List<String> emptyStrings1 = Arrays.asList("", "Hare", "krsna", "", "", "govind");
        
        Optional nonEmptyString = emptyStrings.stream().filter(str -> !str.isEmpty()).findFirst();
        Optional nonEmptyString1 = emptyStrings1.stream().filter(str -> !str.isEmpty()).findFirst();
        System.out.println(nonEmptyString.orElse("All strings are empty"));
        System.out.println(nonEmptyString1.orElse("All strings are empty"));
    }
}
