package javaCollectionFramework;

// ListInterface.java
// This file demonstrates the List interface in Java.

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List: " + list);
    }
}
