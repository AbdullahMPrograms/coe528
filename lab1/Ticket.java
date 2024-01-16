package lab1;

public class Ticket {
    // Instance Variables
    private Passenger passenger;
    private Flight flight;
    private static int ticketCounter = 1; 
    private double price;

    // Constructor
    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger; 
        this.flight = flight;
        this.price = price;
        Ticket.ticketCounter = ticketCounter++;
    }

    // Getters/Setters
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    } 
    
    public Passenger getPassenger() {
        return passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }

    // toString() Override
    @Override
    public String toString() {
        return passenger.getName() + ", " + flight.toString() + ", ticket price: $" + price;
    }
}