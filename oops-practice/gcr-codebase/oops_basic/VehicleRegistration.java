public class VehicleRegistration {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 150.0;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + 
                           ", Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("David", "Sedan");
        v1.displayVehicleDetails();

        VehicleRegistration.updateRegistrationFee(175.0);
        v1.displayVehicleDetails();
    }
}