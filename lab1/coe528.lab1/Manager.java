import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Flight> flights = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public void createFlights() {
        flights.add(new Flight(1, "Toronto", "Vancouver", "10:00", 100, 500.0));
        flights.add(new Flight(2, "Toronto", "Montreal", "12:00", 50, 300.0));
    }

    public void displayAvailableFlights(String origin, String destination) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0) {
                System.out.println(flight);
            }
        }
    }

    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void bookSeat(int flightNumber, Passenger p) {
        Flight flight = getFlight(flightNumber);
        if (flight != null && flight.bookASeat()) {
            double price = p.applyDiscount(flight.getOriginalPrice());
            Ticket ticket = new Ticket(p, flight, price);
            tickets.add(ticket);
            System.out.println("Ticket booked: " + ticket);
        } else {
            System.out.println("Unable to book seat.");
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createFlights();
        manager.displayAvailableFlights("Toronto", "Vancouver");
        Passenger passenger = new Member("John Doe", 30, 6);
        manager.bookSeat(1, passenger);
    }
}
