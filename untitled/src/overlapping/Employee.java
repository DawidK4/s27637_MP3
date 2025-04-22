package overlapping;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

enum EmployeeType {Employee, Manager, Developer, Tester}

interface IManager {
    void manageTeam();
}

interface IDeveloper {
    void developApplication();
}

interface ITester {
    void testSoftware();
}

public class Employee implements IManager, IDeveloper, ITester {
    private final int employeeId;
    private final String name;
    private final EnumSet<EmployeeType> employeeTypes;
    private static final Set<Integer> ids = new HashSet<>();

    private Employee(int employeeId, String name, EnumSet<EmployeeType> roles) {
        if (ids.contains(employeeId)) {
            throw new IllegalArgumentException("Employee must have unique id!");
        }
        if (roles == null || roles.isEmpty()) {
            throw new IllegalArgumentException("Employee must have at least one role!");
        }

        ids.add(employeeId);
        this.employeeId = employeeId;
        this.name = name;
        this.employeeTypes = EnumSet.copyOf(roles);

        if (!employeeTypes.contains(EmployeeType.Employee)) {
            employeeTypes.add(EmployeeType.Employee); // always ensure basic Employee role
        }
    }

    public static Employee createEmployee(int employeeId, String name, EnumSet<EmployeeType> roles) {
        return new Employee(employeeId, name, roles);
    }

    @Override
    public void manageTeam() {
        if (!employeeTypes.contains(EmployeeType.Manager)) {
            throw new UnsupportedOperationException(name + " is not a Manager!");
        }
        System.out.println(name + " is managing the team.");
    }

    @Override
    public void developApplication() {
        if (!employeeTypes.contains(EmployeeType.Developer)) {
            throw new UnsupportedOperationException(name + " is not a Developer!");
        }
        System.out.println(name + " is developing the application.");
    }

    @Override
    public void testSoftware() {
        if (!employeeTypes.contains(EmployeeType.Tester)) {
            throw new UnsupportedOperationException(name + " is not a Tester!");
        }
        System.out.println(name + " is testing the software.");
    }

    public void doGeneralTasks() {
        if (employeeTypes.contains(EmployeeType.Employee)) {
            System.out.println(name + " is doing general employee tasks.");
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public EnumSet<EmployeeType> getEmployeeTypes() {
        return EnumSet.copyOf(employeeTypes);
    }
}
