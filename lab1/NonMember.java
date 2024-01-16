package lab1;

public class NonMember extends Passenger {
    // Constructor
    public NonMember(String name, int age) {
        super(name, age);
    }
    
    // Overriden applyDiscount() method
    @Override
    public double applyDiscount(double p) {
        if(getAge() >= 65) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
