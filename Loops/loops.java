package Loops;

public class loops {
    public static void main(String[] args) {

        // For loop to print numbers from 1 to 10
        System.out.println("For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after the loop

        // While loop to print numbers from 1 to 10
        System.out.println("While Loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println(); // New line after the loop

        // Do-while loop to print numbers from 1 to 10
        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
        System.out.println(); // New line after the loop


        // Nested loop to print a multiplication table
        System.out.println("Multiplication Table:");
        for (int m = 1; m <= 10; m++) {
            for (int l = 1; l <= 10; l++) {
                System.out.print(m * l + "\t"); // Print the product with a tab space
            }
            System.out.println(); // New line after each row
   
    }
    
}
}
