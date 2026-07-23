public class MovieTicketBooking {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicketBooking(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Unassigned";
        this.price = 0.0;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicketBooking ticket = new MovieTicketBooking("Inception");
        ticket.displayDetails();
        ticket.bookTicket("A-12", 15.50);
        ticket.displayDetails();
    }
}