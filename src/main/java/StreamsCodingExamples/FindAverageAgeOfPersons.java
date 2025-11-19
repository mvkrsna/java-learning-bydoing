package StreamsCodingExamples;

import Others.Employee;

import java.util.Arrays;
import java.util.List;

public class FindAverageAgeOfPersons {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Eve", 32, 75000),
                new Employee("Charlie", 35, 60000),
                new Employee("Alice", 30, 70000),
                new Employee("Eve", 32, 75000),
                new Employee("Bob", 25, 50000),
                new Employee("David", 28, 80000)
        );

        employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .ifPresentOrElse(
                        avg -> System.out.println(avg),
                        () -> System.out.println("No employees found")
                );
    }
}
