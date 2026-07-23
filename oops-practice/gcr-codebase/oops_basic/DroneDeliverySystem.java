public class DroneDeliverySystem {
    static class Drone {
        public static String companyName = "AeroDelivery Corp";

        private String droneId;
        private double batteryPercentage;

        public Drone(String droneId, double batteryPercentage) {
            this.droneId = droneId;
            this.batteryPercentage = batteryPercentage;
        }

        public void startDelivery() {
            if (batteryPercentage >= 20.0) {
                batteryPercentage -= 15.0;
                System.out.println("Drone " + droneId + " (" + companyName + ") started delivery. Remaining battery: " + batteryPercentage + "%");
            } else {
                System.out.println("Drone " + droneId + " battery too low to start delivery!");
            }
        }

        public void displayStatus() {
            System.out.println("Drone ID: " + droneId + " | Battery: " + batteryPercentage + "% | Fleet Company: " + companyName);
        }
    }

    public static void main(String[] args) {
        Drone d1 = new Drone("DR-101", 85.0);
        Drone d2 = new Drone("DR-102", 95.0);

        d1.displayStatus();
        d2.displayStatus();

        d1.startDelivery();
        
        // Verifying shared company name
        System.out.println("Shared Company Verification: " + Drone.companyName);
    }
}