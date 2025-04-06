package oops.inheritance;



// Parent class
public class Vehicle {

    final int MAX_SPEED = 120; // final variable
    String color;
    int wheels;

    Vehicle(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Blue", 4);
        vehicle.display(); // Display the details of the vehicle
        System.out.println("Max Speed: " + vehicle.MAX_SPEED); // Accessing the final variable
        
    }
}



