package Others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExploringComparable {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("David", 28, 60000, "HR"),
                new Employee("Bob", 25, 50000, "IT"),
                new Employee("Alice", 30, 70000, "Finance"),
                new Employee("Charlie", 35, 80000, "IT")
        );

        Collections.sort(employees);

        System.out.println("Using Comparable: " + employees);
    }
}
