package methods;

public  class LearnMaths {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Math.min(a, b): " + Math.min(a, b)); // Prints the minimum of a and b
        System.out.println("Math.max(a, b): " + Math.max(a, b)); // Prints the maximum of a and b

        System.out.println("Math.abs(-a): " + Math.abs(-a)); // Prints the absolute value of -a
        System.out.println("Math.sqrt(a): " + Math.sqrt(a)); // Prints the square root of a

        System.out.println("Math.pow(a, 2): " + Math.pow(a, 2)); // Prints a raised to the power of 2
        System.out.println("Math.random(): " + Math.random()); // Prints a random number between 0.0 and 1.0
        
        System.out.println("getRandom(1, 10): " + getRandom(1, 10)); // Prints a random integer between 1 and 10

        System.out.println("Math.PI: " + Math.PI); // Prints the value of PI

        System.out.println(Math.floor(15.26)); // Prints the factorial of 5
        System.out.println(Math.round(45.236)); // Prints whether 7 is a prime number
        System.out.println(Math.ceil(45.236)); // Prints the ceiling value of 45.236

        System.out.println(Math.sin(45)); // Prints the sine of 45 degrees
        System.out.println(Math.cos(45)); // Prints the cosine of 45 degrees
        System.out.println(Math.tan(45)); // Prints the tangent of 45 degrees

        System.out.println(Math.toDegrees(0.785398)); // Converts radians to degrees
        System.out.println(Math.toRadians(45)); // Converts degrees to radians
        


    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a; // Returns a random integer between a and b
    }
}
