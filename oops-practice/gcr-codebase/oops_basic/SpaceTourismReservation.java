public class SpaceTourismReservation {
    static class SpaceTourist {
        public static int totalReservations = 0;
        public static String missionName = "Artemis Lunar Commercial 2026";

        private String touristName;
        private int seatNumber;

        public SpaceTourist(String touristName, int seatNumber) {
            this.touristName = touristName;
            this.seatNumber = seatNumber;
            totalReservations++;
        }

        public SpaceTourist updateSeatNumber(int seatNumber) {
            this.seatNumber = seatNumber;
            return this; 
        }

        public void displayDetails() {
            System.out.println("Mission: " + missionName + " | Tourist: " + touristName + " | Seat #: " + seatNumber);
        }
    }

    public static void main(String[] args) {
        SpaceTourist tourist = new SpaceTourist("Elon", 10);
        tourist.displayDetails();

        tourist.updateSeatNumber(12).updateSeatNumber(15);
        tourist.displayDetails();

        System.out.println("Total Space Reservations: " + SpaceTourist.totalReservations);
    }
}