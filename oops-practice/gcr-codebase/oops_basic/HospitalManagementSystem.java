public class HospitalManagementSystem {
    private static String hospitalName = "St. Jude Memorial Hospital";
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public HospitalManagementSystem(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails(Object obj) {
        if (obj instanceof HospitalManagementSystem) {
            HospitalManagementSystem patient = (HospitalManagementSystem) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name + ", Age: " + patient.age + ", Ailment: " + patient.ailment);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem p1 = new HospitalManagementSystem("Henry Cavill", 41, "Acute Fracture", "PAT-9901");
        p1.displayPatientDetails(p1);

        System.out.println("Total Patients Admitted: " + HospitalManagementSystem.getTotalPatients());
    }
}