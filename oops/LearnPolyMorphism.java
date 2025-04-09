package oops;

class Data{
    int data;

    public void display(){
        System.out.println(data);
    }

    public void display(int times){
        for(int i = 1; i <= times; i++){
            System.out.print(data + " ");
        }
        System.out.println();

    }
}

class ChildData extends Data{

     @Override
     public void display(){
        System.out.println("Overidden Data: " + data);
     }

     public void insideChildOnly(){
        
     }
}


public class LearnPolyMorphism{
    public static void main(String[] args) {

        Data du = new Data();
        
        

        du.display();

        du = new ChildData();

        du.display(); // Runtime polymorphoism aka method overloading

        Data dg;

        dg = new ChildData();

        dg.display(3); // Compile time polymorphoims aka method overloading 


        
    }
}