package StreamsCodingExamples;

import Others.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDeptsWithEmpCountmorethantwo {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("David", "Finance"),
                new Employee("Eva", "Finance"),
                new Employee("Eve", "HR"),
                new Employee("Frank", "IT")
        );
        var result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result);
    }
}
