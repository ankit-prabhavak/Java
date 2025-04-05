package oops;

public class MethodOverloading {
    public static void main(String[] args) {

        Greet greet = new Greet();
        greet.greet(); // Calls the method with no parameters
        greet.greet("Alice"); // Calls the method with one parameter
        greet.greet("Bob", 25); // Calls the method with two parameters

        // You can also create instances of other classes here if needed
        
    }
    
}

class Greet{
    // Method overloading example
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
