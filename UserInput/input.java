package UserInput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Entered age is: " + age);


        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number:");
        long secondNumber = sc.nextLong();

        System.out.println("The sum of the numbers is: "+(int)(firstNumber+secondNumber));

        sc.close();

    }
    
}
