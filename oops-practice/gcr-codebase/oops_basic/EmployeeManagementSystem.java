public class EmployeeManagementSystem {
    private static String companyName = "Nexus Technologies";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees at " + companyName + ": " + totalEmployees);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof EmployeeManagementSystem) {
            EmployeeManagementSystem emp = (EmployeeManagementSystem) obj;
            System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Designation: " + emp.designation);
        } else {
            System.out.println("Invalid Employee object.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem emp1 = new EmployeeManagementSystem("Carol Danvers", 801, "Lead Systems Engineer");
        EmployeeManagementSystem emp2 = new EmployeeManagementSystem("David Miller", 802, "Backend Developer");

        emp1.displayDetails(emp1);
        emp2.displayDetails(emp2);

        EmployeeManagementSystem.displayTotalEmployees();
    }
}