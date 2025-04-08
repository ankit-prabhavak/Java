
public class LearnAbstract {

    public static void main(String[] args) {
        // Creating an object of the Kaar class which is a subclass of Vehicle
        Kaar myKaar = new Kaar(120, "Red");
        
        // Calling methods on the object
        myKaar.start();
        myKaar.accelerate();
        myKaar.stop();
        myKaar.honk(); // Calling the concrete method from the abstract class
        
        // You cannot create an object of the abstract class Vehicle directly
        // Vehicle myVehicle = new Vehicle(100, "Blue"); // This will cause a compilation error
        // Instead, you create an object of a subclass (Kaar) that extends Vehicle
       
        
    }
}

abstract class Vehicle{
    int speed;
    String color;

    
    Vehicle(int speed, String color){
        this.speed = speed;
        this.color = color;
    }
    
    abstract void start();
    abstract void stop();
    abstract void accelerate();
    
    // Concrete method in abstract class
    // This method can be used by subclasses without needing to override it
    void honk() {
        System.out.println("Vehicle is honking.");
    }

}

class Kaar extends Vehicle{
    Kaar(int speed, String color){
        super(speed, color);
    }

    @Override // overriding the abstract method from Vehicle class. Annotation is optional but recommended.
    void start() {
        System.out.println("Kaar is starting with speed: " + speed + " and color: " + color);
    }

    @Override
    void stop() {
        System.out.println("Kaar is stopping.");
    }

    @Override
    void accelerate() {
        System.out.println("Kaar is accelerating.");
    }

}

