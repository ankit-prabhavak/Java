package Arrays;

public class arrayProblems {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Calculate the sum of all elements in the array
        for(int i: array) {
            sum += i;
        }
        System.out.println("Sum of all elements: " + sum);

        System.out.println("The biggest integer is: " + Integer.MAX_VALUE);
        System.out.println("The smallest integer is: " + Integer.MIN_VALUE);


        // Find the maximum element in the array
        int max = array[0];
        for(int i: array) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println("Maximum element: " + max);

        // Find the minimum element in the array
        int min = array[0];
        for(int i: array) {
            if(i < min) {
                min = i;
            }
        }
        System.out.println("Minimum element: " + min);
      
    }
    
}
