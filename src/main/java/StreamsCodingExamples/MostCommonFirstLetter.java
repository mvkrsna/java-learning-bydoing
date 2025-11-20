package StreamsCodingExamples;

import Others.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 26, 25000),
                new Employee("Jack", 26, 25000),
                new Employee("mohan", 26, 25000),
                new Employee("Sai", 26, 25000),
                new Employee("Krishna", 26, 25000),
                new Employee("Eva", 26, 25000),
                new Employee("English", 26, 25000)
        );
        Map<Character, Long> resMap = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName().charAt(0), LinkedHashMap::new, Collectors.counting()));

        var result = resMap.entrySet().stream().max(Comparator.comparing(e -> e.getValue()));
        System.out.println(result);
    }
}
