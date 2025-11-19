package StreamsCodingExamples;

import Others.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartmentAndCalculateAverage {
    public static void main(String[] args) {
        // Write a Java program that demonstrates how to group a list of employees by their department
        // and calculate the average salary for each department using Java Streams API.
        List<Employee> employees = List.of(
                new Employee("Alice", 30, 70000, "Finance"),
                new Employee("Bob", 25, 50000, "IT"),
                new Employee("Charlie", 35, 80000, "IT"),
                new Employee("David", 28, 60000, "HR"),
                new Employee("Eve", 32, 75000, "Finance"),
                new Employee("Frank", 29, 50000, "HR")
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);
    }
}
