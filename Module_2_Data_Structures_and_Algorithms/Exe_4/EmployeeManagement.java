class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + employeeId + ", name='" + name + "', position='" + position + "', salary=" + salary + "}";
    }
}

public class EmployeeManagement {
    static final int CAPACITY = 10;
    static Employee[] employees = new Employee[CAPACITY];
    static int size = 0;

    static boolean add(Employee e) {
        if (size == CAPACITY) {
            System.out.println("Array is full.");
            return false;
        }
        employees[size++] = e;
        return true;
    }

    static Employee search(int employeeId) {
        for (int i = 0; i < size; i++)
            if (employees[i].employeeId == employeeId) return employees[i];
        return null;
    }

    static void traverse() {
        for (int i = 0; i < size; i++)
            System.out.println(employees[i]);
    }

    static boolean delete(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        add(new Employee(1, "Alice", "Manager", 85000));
        add(new Employee(2, "Bob", "Developer", 72000));
        add(new Employee(3, "Charlie", "Designer", 65000));
        add(new Employee(4, "Diana", "Analyst", 70000));

        System.out.println("=== All Employees ===");
        traverse();

        System.out.println("\n=== Search ID 3 ===");
        System.out.println(search(3));

        System.out.println("\n=== Delete ID 2 ===");
        System.out.println(delete(2) ? "Deleted successfully" : "Not found");

        System.out.println("\n=== After Deletion ===");
        traverse();

        System.out.println("\n=== Search deleted ID 2 ===");
        System.out.println(search(2) != null ? search(2) : "Not found");
    }
}
