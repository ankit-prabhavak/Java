package DataTypes;

public class variables {
    public static void main(String[] args) {

        boolean isPassed = true;
        System.out.print(isPassed);  // Printing without new line 


        int count = 12;
        byte marks = 127;
        
        System.out.println(marks);
     
        short score = 32767;

        long number = 2147483647L;
        System.out.println("The Long number is: " + number);

        float f = 3.14f;
        double d = 3.14;

        System.out.println("float: " + f + "double: " + d);

        char myLetter = 'A';
        String name = "A";

        System.out.println("myLetter is a char: " + myLetter + "name is a string: " + name);

        
        // Type casting or  Explicit conversion
        byte num = (byte)count;
        System.out.println(num);
        
        // Implicit conversion
        long num2 = score;
        System.out.println(num2);


    }  
}
