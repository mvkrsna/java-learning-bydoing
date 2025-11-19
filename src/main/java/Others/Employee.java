package Others;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private BigDecimal salary;

    public Employee(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        // Natural order: by age (young -> old)
        return Integer.compare(this.age, other.age);
        // return this.getAge().compareTo(other.getAge());
    }

    @Override
    public String toString() {
        return name + "(age=" + age + ", salary=" + salary + ")";
    }
}
