class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        System.out.println("ID (public): " + employeeID + 
                           ", Department (protected): " + department + 
                           ", Salary (private via getter): $" + getSalary() + 
                           ", Team Size: " + teamSize);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(5001, "Engineering", 120000.0, 12);
        mgr.displayManagerInfo();
        mgr.modifySalary(135000.0);
        System.out.println("Updated Salary: $" + mgr.getSalary());
    }
}