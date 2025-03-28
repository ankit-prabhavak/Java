package conditionalStatements;

public class condition {
    public static void main(String[] args) {

        int age = 2;

        // if-else statement to check if eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        // if-else if-else statements to print the name of the day
        int day = 5;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        // Nested if-else to find the largest of three numbers
        int a = 25, b = 30, c = 20;

        if (a >= b) {  // First check: Is 'a' greater than or equal to 'b'?
            if (a >= c) {  // If 'a' is greater than or equal to 'b', check if 'a' is also greater than or equal to 'c'
                System.out.println("a is the largest");
            } else {  // If 'a' is not greater than or equal to 'c', then 'c' must be the largest
                System.out.println("c is the largest");
            }
        } else {  // If 'b' is greater than 'a', check further
            if (b >= c) {  // If 'b' is greater than or equal to 'c'
                System.out.println("b is the largest");
            } else {  // If 'b' is not greater than or equal to 'c', then 'c' must be the largest
                System.out.println("c is the largest");
            }
        }

        // Ternary operator to check for leap year
        int year = 2024;
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
        System.out.println(year + " is " + result);

        // Switch case to print day name based on the day number
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
