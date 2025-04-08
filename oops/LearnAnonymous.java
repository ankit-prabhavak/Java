package oops;

public class LearnAnonymous {

    OuterClass outerClass = new OuterClass() {
        @Override
        void outerMethod() {
            System.out.println("Overridden outer method called.");
        }
    };

    SuperInterface superInterface = new SuperInterface() {
        @Override
        public void superMethod() {
            System.out.println("Super method called.");
        }
    };

    SuperInterface superInterface2 = () -> {
        System.out.println("Super method called using lambda expression.");
    };
    
       
    
}


class OuterClass {
    int outerField = 10;
    
    void outerMethod() {
        System.out.println("Outer method called.");
        
        // Anonymous inner class implementing an interface
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Anonymous animal is eating.");
            }
            
            @Override
            public void sleep() {
                System.out.println("Anonymous animal is sleeping.");
            }
        };
        
        // Calling methods of the anonymous inner class
        animal.eat();
        animal.sleep();


    }
}

@FunctionalInterface
interface SuperInterface {
    void superMethod();

}