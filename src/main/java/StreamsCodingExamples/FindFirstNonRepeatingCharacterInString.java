package StreamsCodingExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        String[] arrInput = input.split("");
        Stream<String> inputStrArray = Arrays.stream(arrInput);

        var resMap = inputStrArray.collect(
                Collectors.groupingBy(
                        s -> s,
                        LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(resMap);
        Optional<Map.Entry<String, Long>> result = resMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst();

        result.ifPresentOrElse(e -> System.out.println(e), () -> System.out.println(""));
    }
}
