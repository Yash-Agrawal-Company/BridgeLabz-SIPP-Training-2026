class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        }
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String researchTopic) {
        super(rollNumber, name, cgpa);
        this.researchTopic = researchTopic;
    }

    public void displayPGStudent() {
        System.out.println("Roll No: " + rollNumber + ", Name (protected): " + name + 
                           ", CGPA (private access via method): " + getCgpa() + 
                           ", Topic: " + researchTopic);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(201, "Elena", 3.85, "Distributed Quantum Computing");
        pg.displayPGStudent();
        pg.setCgpa(3.92);
        System.out.println("Updated CGPA: " + pg.getCgpa());
    }
}