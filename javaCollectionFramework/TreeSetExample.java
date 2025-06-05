package javaCollectionFramework;

// TreeSetExample.java
// This file demonstrates the usage of TreeSet in Java.

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");

        System.out.println("TreeSet: " + set); // [Apple, Banana, Grapes, Mango, Orange]

        // headSet example: elements less than "Mango"
        SortedSet<String> head = set.headSet("Mango");
        System.out.println("headSet(\"Mango\"): " + head); // [Apple, Banana, Grapes]

        // tailSet example: elements greater than or equal to "Mango"
        SortedSet<String> tail = set.tailSet("Mango");
        System.out.println("tailSet(\"Mango\"): " + tail); // [Mango, Orange]

        // subSet example: elements from "Banana" (inclusive) to "Orange" (exclusive)
        SortedSet<String> sub = set.subSet("Banana", "Orange");
        System.out.println("subSet(\"Banana\", \"Orange\"): " + sub); // [Banana, Grapes, Mango]


    }
}