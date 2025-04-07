package oops.encapsulation;

import oops.encapsulation.Person;  // This is a block

public class Main{
    public static void main(String[] args) {  // This is a block

        Person person = new Person("John Doe", 30);  // This is a block


        
        System.out.println("Name: " + person.getName());  // This is a block
        System.out.println("Age: " + person.getAge());  // This is a block

        
        person.setName("Jane Doe");  // This is a block
        person.setAge(25);  // This is a block
        System.out.println(person.getName());  // This is a block
        System.out.println(person.getAge());  // This is a block


        

    }  

}