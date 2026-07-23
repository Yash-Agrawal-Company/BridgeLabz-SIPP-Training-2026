public class UniversityStudentManagement {
    private static String universityName = "Stanford University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public UniversityStudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled at " + universityName + ": " + totalStudents);
    }

    public void displayOrUpdateGrade(Object obj, String newGrade) {
        if (obj instanceof UniversityStudentManagement) {
            UniversityStudentManagement student = (UniversityStudentManagement) obj;
            System.out.println("Student: " + student.name + " (Roll No: " + student.rollNumber + ")");
            System.out.println("Previous Grade: " + student.grade);
            student.grade = newGrade;
            System.out.println("Updated Grade: " + student.grade);
        } else {
            System.out.println("Invalid Student object.");
        }
    }

    public static void main(String[] args) {
        UniversityStudentManagement st1 = new UniversityStudentManagement("Frank Castle", 1089, "B+");
        st1.displayOrUpdateGrade(st1, "A");

        UniversityStudentManagement.displayTotalStudents();
    }
}