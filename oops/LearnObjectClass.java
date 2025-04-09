package oops;


class BMW{
    String model;

    int year;

    public BMW(String model, int year){
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println("Model: "  + this.model + " Year: " + this.year);
    }

    public String toString(){
        return "Car: " + model + " and year: " + year;
    }

    public boolean equals(Object obj){
        BMW that = (BMW)obj;
        if(this.model == that.model && this.year == that.year){
            return true;
        }

        return false;

    }

    public int hashCode(){
        int initial = 17;
        initial += year;
        initial += model.hashCode();

        return initial;
    }


}


public class LearnObjectClass {
    public static void main(String[] args) {
        BMW carry = new BMW("5633", 2025);
        carry.display();
    
        System.out.println(carry);

        BMW larry = new BMW("5878", 3203);

        larry.display();

        System.out.println(larry);


        System.out.println(carry.equals(larry));

        System.out.println(carry.hashCode());
        System.out.println(larry.hashCode());

        System.out.println(carry.getClass());
        System.out.println(larry.getClass());


        




        
    }
    
}
