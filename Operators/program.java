package Operators;

public class program {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Arithmetic operator
        int result = a+b;
        System.out.println("Sum of a and b is: "+result);

        int div = a/b;
        double c = a/b;
        double div2 = a/ (double)b;

        System.out.println(c);
        System.out.println(div2);
        System.out.println("Division of a and b is: "+div);    // Divsion on integer will give integer result

        // Assignment operator
        a += b;
        System.out.println("Value of a after addition is: "+a);

        // Relational operator
        System.out.println("Is a greater than b: "+(a>b));
        System.out.println("Is a less than b: "+(a<b));
        System.out.println("Is a equal to b: "+(a==b));

        // Logical operator
        boolean x = true;
        boolean y = false;

        System.out.println("The truth value of x and y is: "+(x && y));
        System.out.println("The truth value of x or y is: "+(x || y));
        System.out.println("The truth value of not x is: "+(!x));

        //Increment and Decrement operator
        int d = 10;
        System.out.println("Value of d before increment is: "+d);
        d++;
        System.out.println("Value of d after increment is: "+d);

        //Ternary operator
        int e = 10;
        int f = e > 10 ? 100 : 200;
        System.out.println("Value of f is: "+f);
        
    
    }
}
