package overlapping;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

enum EmployeeType {Employee, Manager, Developer, Tester}

public class Employee implements IManager, IDeveloper, ITester {
    private final int employeeId;
    private final String name;
    private final EnumSet<EmployeeType> employeeTypes;
    private static final Set<Integer> ids = new HashSet<>();

    private final Integer hoursWorked;
    private final String programmingLanguage;

    public Employee(int employeeId, String name) {
        validateId(employeeId);
        this.employeeId = employeeId;

        validateName(name);
        this.name = name;

        this.employeeTypes = EnumSet.of(EmployeeType.Employee);
        this.hoursWorked = null;
        this.programmingLanguage = null;
    }

    public Employee(int employeeId, String name, int hoursWorked) {
        validateId(employeeId);
        this.employeeId = employeeId;

        validateName(name);
        this.name = name;
        this.employeeTypes = EnumSet.of(EmployeeType.Employee, EmployeeType.Manager);

        validateHours(hoursWorked);
        this.hoursWorked = hoursWorked;
        this.programmingLanguage = null;
    }

    public Employee(int employeeId, String name, String programmingLanguage) {
        validateId(employeeId);
        this.employeeId = employeeId;

        validateName(name);
        this.name = name;

        this.employeeTypes = EnumSet.of(EmployeeType.Employee, EmployeeType.Developer);
        this.hoursWorked = null;

        validateLanguage(programmingLanguage);
        this.programmingLanguage = programmingLanguage;
    }

    public Employee(int employeeId, String name, int hoursWorked, String programmingLanguage) {
        validateId(employeeId);
        this.employeeId = employeeId;

        validateName(name);
        this.name = name;
        this.employeeTypes = EnumSet.of(EmployeeType.Employee, EmployeeType.Manager, EmployeeType.Developer);

        validateHours(hoursWorked);
        this.hoursWorked = hoursWorked;

        validateLanguage(programmingLanguage);
        this.programmingLanguage = programmingLanguage;
    }

    // Attribute validation
    private static void validateId(int id) {
        if (ids.contains(id)) {
            throw new IllegalArgumentException("Employee must have unique id!");
        }
        ids.add(id);
    }

    private static void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty!");
        }
    }

    private static void validateHours(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked must not be negative!");
        }
    }

    private static void validateLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty()) {
            throw new IllegalArgumentException("Programming language must not be null or empty!");
        }
    }

    @Override
    public void manageTeam() {
        if (!employeeTypes.contains(EmployeeType.Manager)) {
            throw new UnsupportedOperationException(name + " is not a Manager!");
        }
        System.out.println(name + " is managing the team.");
    }

    @Override
    public int getHoursWorked() {
        if (!employeeTypes.contains(EmployeeType.Manager)) {
            throw new UnsupportedOperationException(name + " is not a Manager!");
        }
        return hoursWorked;
    }

    @Override
    public void developApplication() {
        if (!employeeTypes.contains(EmployeeType.Developer)) {
            throw new UnsupportedOperationException(name + " is not a Developer!");
        }
        System.out.println(name + " is developing the application.");
    }

    @Override
    public String getProgrammingLanguage() {
        if (!employeeTypes.contains(EmployeeType.Developer)) {
            throw new UnsupportedOperationException(name + " is not a Developer!");
        }
        return programmingLanguage;
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

    public EnumSet<EmployeeType> getEmployeeTypes() {
        return EnumSet.copyOf(employeeTypes);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}

