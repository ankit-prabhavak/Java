package oops;

public class MainClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.age = 5;
        dog.breed = "Golden Retriever";
        dog.bark();

      

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.age = 3;
        cat.breed = "Siamese";
        cat.meow();

        ComplexNumber complexNumber = new ComplexNumber(3.0, 4.0);
        System.out.print("Complex Number: ");
        complexNumber.display();

        ComplexNumber complexNumber2 = new ComplexNumber(1.0, 2.0);
        ComplexNumber sum = complexNumber.add(complexNumber2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();

       

        
    }
}


class ComplexNumber{
        // ComplexNumber class implementation
        double real;
        double imaginary;

        ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        void display() {
            System.out.println(real + " + " + imaginary + "i");
        }

        ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
        }

}


class Dog{
        // Dog class implementation
        String name;

        int age;

        String breed;

        void bark() {
            System.out.println(name + ": Woof! Woof!");
        }

    }

class Cat{
        // Cat class implementation
        String name;

        int age;

        String breed;

        void meow() {
            System.out.println(name + ": Meow! Meow!");
        }

    }
    
