package StreamsCodingExamples;

import Others.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeptWithHighestAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 30, 70000, "HR"),
                new Employee("Bob", 28, 80000, "IT"),
                new Employee("Charlie", 32, 90000, "IT"),
                new Employee("David", 45, 120000, "Finance"),
                new Employee("Eva", 29, 75000, "Finance"),
                new Employee("Eve", 35, 95000, "HR"),
                new Employee("Frank", 40, 110000, "IT")
        );

        Optional<Map.Entry<String, Double>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue()));

        result.ifPresentOrElse(System.out::println, () -> System.out.println("No result found"));

    }
}
