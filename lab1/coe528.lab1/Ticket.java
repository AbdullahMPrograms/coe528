public class Ticket {
    private static int counter = 1;
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.number = counter++;
    }

    @Override
    public String toString() {
        return passenger.getName() + ", " + flight.toString() + ", ticket price: $" + price;
    }
}
