package Arrays;

public class basic {
    public static void main(String[] args) {
        // both are valid declarations
        int ages[];
        ages = new int[5];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        
        int[] umar = new int[5];

        System.out.println(umar.length); // length of array

        int marks[] = {10, 20, 30, 40, 50}; // array initialization

        // printing array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // printing array using for-each loop
        String[] names = {"umar", "ali", "ahmed", "saad", "waqar"};

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
 
    }
    
}
