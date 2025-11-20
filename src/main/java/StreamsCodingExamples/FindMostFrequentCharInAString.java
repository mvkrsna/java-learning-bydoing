package StreamsCodingExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMostFrequentCharInAString {
    public static void main(String[] args) {
        String str = "SSSpppringBoot";
        String[] strArrays = str.split("");
        Stream<String> streamOfStrings = Arrays.stream(strArrays);
        Map<String, Long> resultMap = streamOfStrings.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        var finalResult = resultMap.entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue()));
        // .ifPresent(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        finalResult.ifPresentOrElse(e -> System.out.println(e.getKey() + " : " + e.getValue()), () -> System.out.println("Not found"));
    }

}
