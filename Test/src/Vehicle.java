public class Vehicle {
    // Attributes
    private String make;
    private String model;
    private int numOfDoors;
    private int wheels;
    private int maxPassengers;

    // Constructors
    Vehicle() {         // Default constructor
        make = "";
        model = "";
        numOfDoors = 0;
        wheels = 0;
        maxPassengers = 0;
    }
    Vehicle(String make, String model, int numOfDoors, int wheels, int maxPassengers) {    // Constructor w/ Parameters
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
        this.wheels = wheels;
        this.maxPassengers = maxPassengers;
    }

    // Methods
    public void exhaustNoise() {
        System.out.println("Vroom vroom!");
    }

    // Getters & Setters (Methods)
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    // Removed rest of getters & setters for simplicity
}
