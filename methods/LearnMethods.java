package methods;

public class LearnMethods {

    public static void main(String[] args) {
        greet(); // Calling static method
        
        average(12, 15); // Calling static method with parameters

        int sum = add(5, 10); // Calling static method with return value
        System.out.println("Sum: " + sum); // Printing the returned value
        
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void greet() {
        System.out.println("Hello, World!");
    }

    public static void average(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println("Average: " + avg);
    }



}