package coe528.lab1;

public class Flight {
    // Instance Variables
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    // Constructor
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, int numberOfSeatsLeft, double originalPrice) {
        if(origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and Destination of flight cannot be the same.");
        }
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = numberOfSeatsLeft;
        this.originalPrice = originalPrice;
    }

    // Getters/Setters
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
     
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
     
    public int getCapacity() {
        return capacity;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
     
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    //bootASeat(), boolean, condition is if numberOfSeatsLeft > 0
    public boolean bookASeat() {
        if(numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        } else {
            return false;
        }
    }

    // toString() Override
    @Override
    public String toString() {
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", " + "original price: $" + originalPrice;
    }
}
