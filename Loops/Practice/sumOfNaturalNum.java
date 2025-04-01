package Practice;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum of natural numbers up to any number
        int sum = 0;
        int EvenSum = 0;
        int OddSum = 0;

        // Using a for loop to calculate the sum of natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i; 
            EvenSum += i*2;
            OddSum += i*2-1; 
        }

        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);
        System.out.println("The sum of first " + n + " even natural numbers is: " + EvenSum);
        System.out.println("The sum of first " + n + " odd natural numbers is: " + OddSum);


    }
}
