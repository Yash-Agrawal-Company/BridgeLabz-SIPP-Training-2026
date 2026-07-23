public class EVChargingNetwork {
    static class ChargingStation {
        public static int totalStations = 0;
        public static double electricityRate = 0.15; // $ per unit

        private String stationId;
        private double unitsConsumed;

        public ChargingStation(String stationId) {
            this.stationId = stationId;
            this.unitsConsumed = 0.0;
            totalStations++;
        }

        public void consumeUnits(double units) {
            this.unitsConsumed += units;
        }

        public double calculateBill() {
            return unitsConsumed * electricityRate;
        }

        public void displayStationDetails() {
            System.out.println("Station ID: " + stationId + " | Units: " + unitsConsumed + " | Bill @ $" + electricityRate + "/unit: $" + calculateBill());
        }
    }

    public static void main(String[] args) {
        ChargingStation[] stations = new ChargingStation[5];
        for (int i = 0; i < 5; i++) {
            stations[i] = new ChargingStation("STATION-0" + (i + 1));
            stations[i].consumeUnits(50 + (i * 20));
        }

        System.out.println("--- Initial Rates ($0.15/unit) ---");
        for (ChargingStation s : stations) s.displayStationDetails();

        // Rate change immediately affects all stations
        ChargingStation.electricityRate = 0.22;

        System.out.println("\n--- Rate Updated Globally ($0.22/unit) ---");
        for (ChargingStation s : stations) s.displayStationDetails();
    }
}