package javaCollectionFramework;

// SortingExample.java
// This file demonstrates sorting with Java collections.

import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
