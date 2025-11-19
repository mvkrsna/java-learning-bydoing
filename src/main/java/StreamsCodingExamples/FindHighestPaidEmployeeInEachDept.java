package StreamsCodingExamples;

import Others.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeeInEachDept {
    public static void main(String[] args) {
        // Write a Java program that finds the highest-paid employee in each department from a list of employees using Java Streams API.
        List<Employee> employees = List.of(
                new Employee("Alice", 30, 70000, "Finance"),
                new Employee("Bob", 25, 50000, "IT"),
                new Employee("Charlie", 35, 80000, "IT"),
                new Employee("David", 28, 60000, "HR"),
                new Employee("Eve", 32, 75000, "Finance"),
                new Employee("Frank", 29, 45000, "HR")
        );

        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        System.out.println(result);

        // max
        Map<String, Optional<Employee>> resultWith = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(resultWith);
        // min value
        var minResult = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(minResult);

        var resultWithSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(resultWithSalary);
    }
}
