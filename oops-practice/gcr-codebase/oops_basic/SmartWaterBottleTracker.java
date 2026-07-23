public class SmartWaterBottleTracker {
    static class WaterBottle {
        private String ownerName;
        private double dailyTarget; // Liters

        public WaterBottle(String ownerName, double dailyTarget) {
            this.ownerName = ownerName;
            this.dailyTarget = dailyTarget;
        }

        public void displayBottleInfo() {
            System.out.println("Owner: " + ownerName + " | Daily Target: " + dailyTarget + "L");
        }
    }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle("Liam", 2.5);
        WaterBottle b2 = new WaterBottle("Emma", 3.0);

        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}