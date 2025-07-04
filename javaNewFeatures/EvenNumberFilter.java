package javaNewFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Output the even numbers
        System.out.println("Even numbers: " + evenNumbers);
    }
}
