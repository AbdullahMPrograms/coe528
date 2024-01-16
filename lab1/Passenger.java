package lab1;

public abstract class Passenger {
    // Instance Variables
    private String name;
    private int age;

    // Constructor
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters/Setters
    public void setName(String name) {
        // Not necessary but good practice
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        // Not necessary but good practice
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    // Abstract Method applyDiscount(), no code just "framework"
    public abstract double applyDiscount(double p);
}
