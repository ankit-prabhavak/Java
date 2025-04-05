package oops;

public class Constructor {
    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(3.0, 4.0);
        System.out.print("Complex Number: ");
        complexNumber.display();

        ComplexNumber complexNumber2 = new ComplexNumber(1.0, 2.0);
        ComplexNumber sum = complexNumber.add(complexNumber2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();

    }
    
}



