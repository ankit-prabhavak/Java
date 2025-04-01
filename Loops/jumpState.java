package Loops;

public class jumpState {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.print(i + " "); // This will print numbers from 1 to 10, skipping 5
        }
        System.out.println(); // Print a new line after the loop
    
    // The continue statement skips the current iteration of the loop and moves to the next iteration.

    //Now, break statement
       int j = 0;
       while (j < 10) {
          j++;
          if (j == 5) {
            break; // Exit the loop when i is 5
           }
           System.out.print(j + " "); // This will print numbers from 1 to 4, and then exit the loop     }
        }
        System.out.println(); // Print a new line after the loop

  }
    
}
