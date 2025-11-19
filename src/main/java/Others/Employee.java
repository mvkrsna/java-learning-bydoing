package Others;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age, int salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
