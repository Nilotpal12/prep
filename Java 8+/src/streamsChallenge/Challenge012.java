package streamsChallenge;

/*
    Given a list of employees, return a map of departments → list of employees who earn more than ₹50,000.
 */

import streamsChallenge.Helper.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge012 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 70000),
                new Employee("Bob", "Engineering", 48000),
                new Employee("Carol", "HR", 55000),
                new Employee("Dave", "HR", 50000),
                new Employee("Eve", "Marketing", 67000)
        );

        Map<String, List<Employee>> result = getHighEarningEmployeesByDepartment(employees);
        System.out.println(result);
    }

    private static Map<String, List<Employee>> getHighEarningEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

}
