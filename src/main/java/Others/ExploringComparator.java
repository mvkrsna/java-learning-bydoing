package Others;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        // return Integer.compare(e1.getAge(), e2.getAge()); // Ascending order by age
        return e1.getName().compareTo(e2.getName()); // Descending order by name
    }
}

public class ExploringComparator {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("David", 28, 60000),
                new Employee("Bob", 25, 50000),
                new Employee("Alice", 30, 70000),
                new Employee("Charlie", 35, 80000)
        );
//        String name = "venkat";
//        int res = name.compareTo("krishn");
//        System.out.println("Result: " + res); // -1 not equal, 0 for equal, 1 for greater than

        employees.sort(new EmployeeComparator());
        System.out.println("Using Comparator on Name: " + employees);

        employees.sort((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Using Lambda on Salary: " + employees);

        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Using Comparing Salary : " + employees);

        employees.sort(Comparator.comparing(Employee::getAge));
        System.out.println("Using Comparing Age : " + employees);
    }
}
