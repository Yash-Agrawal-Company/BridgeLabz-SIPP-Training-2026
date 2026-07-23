public class OnlineCourseManagement {
    private String courseName;
    private int durationMonths;
    private double fee;
    private static String instituteName = "Tech Academy";

    public OnlineCourseManagement(String courseName, int durationMonths, double fee) {
        this.courseName = courseName;
        this.durationMonths = durationMonths;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + ", Course: " + courseName + 
                           ", Duration: " + durationMonths + " months, Fee: $" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        OnlineCourseManagement c1 = new OnlineCourseManagement("Java Full Stack", 6, 1500.0);
        c1.displayCourseDetails();

        OnlineCourseManagement.updateInstituteName("Global Institute of Technology");
        c1.displayCourseDetails();
    }
}