package overlapping;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

enum EmployeeType {Employee, Manager, Developer, Tester}

public class Employee {
    private int employeeId;
    private String name;
    private EnumSet<EmployeeType> employeeType = EnumSet.of(EmployeeType.Employee);

    private static Set<Integer> ids = new HashSet<>();

    public Employee(int employeeId, String name) {
        if (ids.contains(employeeId)) {
            throw new IllegalArgumentException("Employee must have unique id!");
        }
        ids.add(employeeId);

        this.employeeId = employeeId;
        this.name = name;
    }

    public void addRole(EmployeeType type) {
        employeeType.add(type);
    }

    public void removeRole(EmployeeType type) {
        if (type != EmployeeType.Employee) {
            employeeType.remove(type);
        }
    }

    public boolean hasRole(EmployeeType type) {
        return employeeType.contains(type);
    }

    public void work() {
        if (employeeType.contains(EmployeeType.Manager)) {
            System.out.println(name + " is managing the team.");
        }
        if (employeeType.contains(EmployeeType.Developer)) {
            System.out.println(name + " is developing the application.");
        }
        if (employeeType.contains(EmployeeType.Tester)) {
            System.out.println(name + " is testing the software.");
        }
        if (employeeType.size() == 1 && employeeType.contains(EmployeeType.Employee)) {
            System.out.println(name + " is doing general employee tasks.");
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
