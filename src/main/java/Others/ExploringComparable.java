package Others;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExploringComparable {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("David", 28, new BigDecimal(60000)),
                new Employee("Bob", 25, new BigDecimal(50000)),
                new Employee("Alice", 30, new BigDecimal(70000)),
                new Employee("Charlie", 35, new BigDecimal(80000))
        );

        Collections.sort(employees);
        
        System.out.println("Using Comparable: " + employees);
    }
}
