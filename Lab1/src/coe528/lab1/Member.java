package coe528.lab1;

public class Member extends Passenger {
    // Instance Variables
    private int yearsOfMembership;

    // Constructor
    public Member(int yearsOfMembership, String name, int age) {
        //Implicit super constructor Passenger() is undefined. Must explicitly invoke another constructor, super(name, age) from passenger
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    // Overriden applyDiscount() method
    @Override
    public double applyDiscount(double p) {
        if(yearsOfMembership >= 5) {
            return p * 0.5;
        } else if(yearsOfMembership >= 1) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
