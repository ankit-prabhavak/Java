package javaCollectionFramework;

// SortedSetInterface.java
// This file demonstrates the SortedSet interface in Java.

import java.util.*;

public class SortedSetInterface {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");

        System.out.println("SortedSet: " + set);
    }
}
