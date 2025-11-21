package functionalInterfaces;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.*;

public class PredicateFunctionalInterfacesExploration {
    public static void main(String[] args) {

        Predicate<String> pred =
                (s) -> {
                    return s.equalsIgnoreCase("hello");
                };


        boolean result = pred.test("HELLO");
        System.out.println(result);

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));

        /*Bi-Consumer Example*/
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello consumer World");

        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1 + "-" + s2);
        };
        biConsumer.accept("Hello bi", "Consumer World");

        Supplier<String> supplier = () -> "Hello supplier World";
        System.out.println(supplier.get());

        Function<String, Map<String, String>> function =
                (input) -> {
                    HashMap<String, String> output = new HashMap<>();
                    output.put(input, input.toUpperCase(Locale.ROOT));
                    return output;
                };


        System.out.println(function.apply("hello_function"));
    }
}
