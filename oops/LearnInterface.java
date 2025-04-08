package oops;

public class LearnInterface {
    public static void main(String[] args) {
        // Creating an object of the Dog class which implements Animal interface
        Dog myDog = new Dog();
        
        // Calling methods on the object
        myDog.eat();
        myDog.sleep();
        
        // You cannot create an object of the interface directly
    
    }
    
}


interface Animal {
    void eat(); // abstract method
    void sleep(); // abstract method

    default void makeSound() { // default method
        System.out.println("Animal makes a sound.");
    }

    
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}