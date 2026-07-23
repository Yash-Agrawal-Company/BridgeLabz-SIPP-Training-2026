public class VehicleRegistrationSystem {
    private static double registrationFee = 250.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof VehicleRegistrationSystem) {
            VehicleRegistrationSystem v = (VehicleRegistrationSystem) obj;
            System.out.println("Owner: " + v.ownerName + 
                               ", Type: " + v.vehicleType + 
                               ", Reg No: " + v.registrationNumber + 
                               ", Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem v1 = new VehicleRegistrationSystem("Grace Hopper", "Electric SUV", "REG-8829-CA");
        v1.displayRegistrationDetails(v1);

        VehicleRegistrationSystem.updateRegistrationFee(275.0);
        v1.displayRegistrationDetails(v1);
    }
}