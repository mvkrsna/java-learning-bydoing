package StreamsCodingExamples;

import java.util.List;

public class FlattenTheList {
    public static void main(String[] args) {
        List<List<String>> listOfFruits = List.of(
                List.of("Apple", "Banana"),
                List.of("Grapes", "Oranges"),
                List.of("Kiwi", "Muskmelon")
        );
        List<String> result = listOfFruits.stream()
//                .flatMap(fruits -> fruits.stream())
                .flatMap(List::stream)
                .toList();

        System.out.println(result);
    }
}
