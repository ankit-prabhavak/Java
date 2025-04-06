package oops.inheritance;

public class Car extends Vehicle {
    String model;
    int year;

    Car(String color, int wheels, String model, int year) {
        super(color, wheels); // Call the constructor of the parent class (Vehicle)
        this.model = model;
        this.year = year;
    }

    void display() {
        super.display(); // Call the display method of the parent class (Vehicle)
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        Car car = new Car("Red", 4, "Toyota", 2020);
        car.display(); // Display the details of the car
        System.out.println("Max Speed: " + car.MAX_SPEED); // Accessing the final variable from the parent class


    }
    
}
