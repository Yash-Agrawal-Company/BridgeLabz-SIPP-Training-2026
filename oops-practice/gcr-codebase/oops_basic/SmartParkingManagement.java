public class SmartParkingManagement {
    static class Vehicle {
        private String vehicleNumber;
        private String ownerName;
        private String vehicleType; // "Car" or "Bike"

        public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
            this.vehicleNumber = vehicleNumber;
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public void displayInfo() {
            System.out.println("[" + vehicleType.toUpperCase() + "] Reg: " + vehicleNumber + " | Owner: " + ownerName);
        }
    }

    private Vehicle[] parkingLot = new Vehicle[10];

    public void displayCars() {
        System.out.println("--- PARKED CARS ---");
        for (Vehicle v : parkingLot) {
            if (v != null && "Car".equalsIgnoreCase(v.getVehicleType())) {
                v.displayInfo();
            }
        }
    }

    public void displayBikes() {
        System.out.println("--- PARKED BIKES ---");
        for (Vehicle v : parkingLot) {
            if (v != null && "Bike".equalsIgnoreCase(v.getVehicleType())) {
                v.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        SmartParkingManagement system = new SmartParkingManagement();
        system.parkingLot[0] = new Vehicle("KA-01-1234", "Aarav", "Car");
        system.parkingLot[1] = new Vehicle("KA-01-5678", "Bhavna", "Bike");
        system.parkingLot[2] = new Vehicle("KA-02-9999", "Chetan", "Car");
        system.parkingLot[3] = new Vehicle("KA-03-1111", "Divya", "Bike");
        system.parkingLot[4] = new Vehicle("KA-04-2222", "Esha", "Car");
        system.parkingLot[5] = new Vehicle("KA-05-3333", "Farhan", "Bike");
        system.parkingLot[6] = new Vehicle("KA-06-4444", "Gautam", "Car");
        system.parkingLot[7] = new Vehicle("KA-07-5555", "Hari", "Bike");
        system.parkingLot[8] = new Vehicle("KA-08-6666", "Isha", "Car");
        system.parkingLot[9] = new Vehicle("KA-09-7777", "Jay", "Bike");

        system.displayCars();
        system.displayBikes();
    }
}