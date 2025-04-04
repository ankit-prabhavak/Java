package strings;
import java.util.Scanner;

public class stringPro {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        String str = "Hello, World!";
        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        
        // Char array example
        char ch[] = {'H', 'e', 'l', 'l', 'o'};
        
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();

        String naam = "Ankit";
        String naam2 = "Ankit";
        String naam1 = "ankit";
        String naam3 = new String("Ankit");
        System.out.println(naam == naam2); // true, same reference
        System.out.println(naam == naam3); // false, different reference

        System.out.println(naam.equals(naam3)); // true, same content
        System.out.println(naam.equals(naam2)); // true, same content

        System.out.println(naam.equalsIgnoreCase(naam1)); // true, same content ignoring case

       sc.close();
    }
    
}
