package StreamAPIJAVA.MapDemo;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class FilterMapDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alice", 50000),
                new Employee(2, "Bob", 60000),
                new Employee(3, "Charlie", 70000),
                new Employee(4, "David", 80000),
                new Employee(5, "Eve", 90000),
                new Employee(6, "Frank", 100000),
                new Employee(7, "Grace", 110000),
                new Employee(8, "Hannah", 120000),
                new Employee(9, "Ian", 130000),
                new Employee(10, "Jack", 140000)
        );
        // Filter employees with salary greater than 80000 and map to their names
        List<String> highSalaryEmployeeNames = employeeList.stream()
                .filter(employee -> employee.salary > 80000) // Filter employees with salary greater than 80000
                .map(employee -> employee.name) // Map to their names
                .toList(); // Collect the results into a list
        System.out.println("Employees with salary greater than 80000: " + highSalaryEmployeeNames);
    }
}
