package strings;
import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Enter your first name and last name:");
        // Using next() to read first and last name separately
        String first = sc.next();
        String last = sc.next();
        String fullName = first + " " + last;
        System.out.println("Full name: " + fullName);

        //String methods
        String str = "Hello, World!";
        System.out.println(str.length());
        System.out.println(str.charAt(0)); // H
        System.out.println(str.indexOf("World")); // 7
        System.out.println(str.substring(7)); // World!
        System.out.println(str.substring(7, 12)); // World
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase()); // HELLO, WORLD!
        System.out.println(str.replace("World", "Java")); // Hello, Java!
        System.out.println(str.contains("World")); // true

        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.endsWith("World")); // true

        System.out.println(str.equals("Hello, World!")); // true
        System.out.println(str.equalsIgnoreCase("hello, world!")); // true

        System.out.println(str.compareTo("Hello, World!")); // 0 (equal)
        System.out.println(str.compareTo("Hello, Java!")); // >0 (greater than)

        String str1 = "   Hello, World!   ";
        System.out.println(str1.trim()); // Hello, World! (removes leading and trailing spaces)

        System.out.println(str1.replaceAll("\\s", "")); // Hello,World! (removes all spaces)
        System.out.println(str1.split(",")[0]); // Hello (splits the string at the comma)

        System.out.println(str1.split(",")[1]); //  World! (splits the string at the comma)

        int age = 25;
        String ageStr = String.valueOf(age); // Convert int to String
        System.out.println("Age as String: " + ageStr);
        System.out.println("String to int: " + Integer.parseInt(ageStr)); // Convert String to int
        System.out.println("String to double: " + Double.parseDouble("3.14")); // Convert String to double
        
        System.out.println("String to boolean: " + Boolean.parseBoolean("true")); // Convert String to boolean


        //Replacing characters in a string
        String jaanu = "Ankita";
        jaanu = jaanu.replace('A', 'a'); // Replacing 'A' with 'a'
        System.out.println(jaanu); // ankita

        char letters[] = name.toCharArray(); // Convert string to char array
        System.out.println("Character array:");
        for (char letter : letters) {
            System.out.print(letter + " "); // Print each character
        }
        System.out.println();

        String emp = "";
        System.out.println(emp.isEmpty());
        System.out.println(emp.isBlank()); // Check if the string is empty or blank

        
        sc.close();

    }
    
}
