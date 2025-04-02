package Practice;

public class pattern {

    public static void main(String[] args) {
        int n = 5; // Number of rows for the pattern

        // Loop to print the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    
}
