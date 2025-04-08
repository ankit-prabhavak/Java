package oops;

public class LearnInnerClass {

    class Toy {
        int price;
    }
    
    static class StaticToy {
        int price;
    }


    

    public static void main(String[] args) {
        // Creating an object of the outer class
        LearnInnerClass outer = new LearnInnerClass();
        
        // Creating an object of the inner class using the outer class object
        Toy myToy = outer.new Toy();
        
        // Setting the price of the toy
        myToy.price = 100;
        
        // Printing the price of the toy
        System.out.println("Price of the toy: " + myToy.price);

        
    }
    
}
