import java.util.TreeSet;

// Employee class implementing Comparable to define sorting by salary
class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
public int compareTo(Employee other) {
    // TreeSet uses compareTo() to decide order and uniqueness.
    // If this method returns 0, TreeSet treats the two objects as duplicates.

    // First, compare salaries
    if (this.salary == other.salary) {
        // If salaries are the same, compare by names to break the tie.
        // This ensures that employees with the same salary but different names
        // are treated as distinct and sorted alphabetically.
        return this.name.compareTo(other.name);
    }

    // If salaries are different, compare by salary in ascending order.
    // Double.compare handles precision and returns:
    //   < 0 if this.salary < other.salary
    //   = 0 if this.salary == other.salary
    //   > 0 if this.salary > other.salary
    return Double.compare(this.salary, other.salary);
}


    // toString for easy display
    @Override
    public String toString() {
        return name + " - ₹" + salary;
    }
}

// Main class to demonstrate TreeSet with Employee
public class EmployeeSorter {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        // Adding sample employees
        employees.add(new Employee("Ankit", 55000));
        employees.add(new Employee("Bhavna", 47000));
        employees.add(new Employee("Charan", 55000)); // Same salary as Ankit
        employees.add(new Employee("Divya", 62000));
        employees.add(new Employee("Eshan", 40000));

        // Display sorted employees by salary
        System.out.println("Employees sorted by salary (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}


