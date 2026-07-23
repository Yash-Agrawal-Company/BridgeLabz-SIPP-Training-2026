public class StudentReport {
    private String name;
    private int rollNumber;
    private double marks;

    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 75) return 'B';
        if (marks >= 60) return 'C';
        if (marks >= 40) return 'D';
        return 'F';
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
        System.out.println("Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentReport student = new StudentReport("Jordan", 42, 88.5);
        student.displayDetails();
    }
}