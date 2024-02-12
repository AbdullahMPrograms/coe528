/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AbdullahPC
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        int expResult = flight1.getFlightNumber();
        
        assertEquals(expResult, flight1.getFlightNumber());
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setOrigin("Vancouver");
        
        assertEquals("Vancouver", flight1.getOrigin());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals("Toronto", flight1.getOrigin());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setDestination("Vancouver");
        
        assertEquals("Vancouver", flight1.getDestination());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals("New Dehli", flight1.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setDepartureTime("12:00");
        
        assertEquals("12:00", flight1.getDepartureTime());
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals("10:00", flight1.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setCapacity(50);
        
        assertEquals(50, flight1.getCapacity());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals(100, flight1.getCapacity());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setNumberOfSeatsLeft(50);
        
        assertEquals(50, flight1.getNumberOfSeatsLeft());
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals(5, flight1.getNumberOfSeatsLeft());
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setOriginalPrice(120.0);
        
        
        
        assertEquals(120.0, flight1.getOriginalPrice(), 0.01);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        
        assertEquals(500.0, flight1.getOriginalPrice(), 0.01);
    }


    /**
     * Test of bookASeat method, of class Flight.
     */
    @org.junit.Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight flight = new Flight(1, "Toronto", "Vancouver", "10:00", 100, 10, 500.0);
        assertTrue(flight.bookASeat());
        assertEquals(9, flight.getNumberOfSeatsLeft());
        
        for(int i=0; i<9; i++) {
            assertTrue(flight.bookASeat());
        }

        assertFalse(flight.bookASeat());
    }

    // flight from toronto to newdehli and change the flight number
    @org.junit.Test
    public void testSetFlightNumber() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        flight1.setFlightNumber(5);
        
        assertEquals(5, flight1.getFlightNumber());
    }
    
    //two flights with the same number
    @org.junit.Test
    public void testForClass2() {
        Flight flight1 = new Flight(3, "Toronto", "New Dehli", "10:00", 100, 5, 500.0);
        Flight flight2 = new Flight(4, "Toronto", "Vancouver", "10:00", 100, 5, 500.0);
        if(flight1.getFlightNumber() == flight2.getFlightNumber()){
            throw new IllegalArgumentException("Flight Number already exists");
        }
        
        String result = flight1.toString();
        String expResult="Flight 3, Toronto to New Dehli, 10:00, original price: $500.0";
        boolean compare = expResult.equals(result);
        
        assertTrue(compare);
    }
    
    // write function that reverses the flightnumber
    @org.junit.Test
    public void testForClass3() {
        Flight flight1 = new Flight(1235, "Toronto", "Vancouver", "10:00", 100, 5, 500.0);
        
        int flightNumber = flight1.getFlightNumber();
        int reverse = 0;
        
        while(flightNumber != 0) {  
            int remainder = flightNumber % 10;  
            reverse = reverse * 10 + remainder;  
            flightNumber = flightNumber/10;  
        }  
        
        String expResult = "5321";
        String result = String.valueOf(reverse);
        
        boolean compare = expResult.equals(result);
        assertTrue(compare);
        System.out.println("The reverse of the given number is: " + reverse);        
        
    }
    
    /**
     * Test of toString method, of class Flight.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Flight flight = new Flight(5, "Toronto", "Vancouver", "10:00", 100, 5, 500.0);
        String expResult = "Flight 5, Toronto to Vancouver, 10:00, original price: $500.0";
        String result = flight.toString();
        boolean compare = expResult.equals(result);
        assertTrue(compare);
    }
    
}
