package StreamsCodingExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main(String[] args) {
//        how to create streams in java

        // 1. From Collections
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Charlie");
        Stream<String> namesAsStreams = names.stream();
        // 2. From String Arrays
        String[] namesArray = {"John", "Jane", "Bob", "Alice", "Charlie"};
        Stream<String> namesArrayAsStreams = Arrays.stream(namesArray);

        // 3. Using Stream.of() method
        Stream<String> namesOfStream = Stream.of("John", "Jane", "Bob", "Alice", "Charlie");

        // 4. Using Stream.generate() method
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);

        // Random number generation examples
        System.out.println("=== Random Number Generation with Streams ===");
        
        // 1. Random doubles using Math.random()
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        
        // 2. Random integers using Random class
        Random random = new Random();
        random.ints(5, 1, 100)
                .forEach(System.out::println);
        
        // 3. Random doubles in range using Random class
        random.doubles(3, 0.0, 10.0)
                .forEach(System.out::println);
        
        // 4. Infinite random stream (limited for demo)
        IntStream.generate(() -> random.nextInt(50))
                .limit(4)
                .forEach(System.out::println);

    }
}
