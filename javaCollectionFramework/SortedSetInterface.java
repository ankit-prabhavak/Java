package javaCollectionFramework;

// SortedSetInterface.java
// This file demonstrates the SortedSet interface in Java with examples and common methods.

import java.util.*;

public class SortedSetInterface {
    public static void main(String[] args) {
        // Creating a SortedSet using TreeSet
        SortedSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");

        System.out.println("SortedSet: " + set); // [Apple, Banana, Grapes, Mango, Orange]

        // first() - returns the first (lowest) element
        System.out.println("First element: " + set.first()); // Apple

        // last() - returns the last (highest) element
        System.out.println("Last element: " + set.last()); // Orange

        // headSet(E toElement) - elements less than "Mango"
        SortedSet<String> head = set.headSet("Mango");
        System.out.println("headSet(\"Mango\"): " + head); // [Apple, Banana, Grapes]

        // tailSet(E fromElement) - elements greater than or equal to "Mango"
        SortedSet<String> tail = set.tailSet("Mango");
        System.out.println("tailSet(\"Mango\"): " + tail); // [Mango, Orange]

        // subSet(E fromElement, E toElement) - elements from "Banana" (inclusive) to "Orange" (exclusive)
        SortedSet<String> sub = set.subSet("Banana", "Orange");
        System.out.println("subSet(\"Banana\", \"Orange\"): " + sub); // [Banana, Grapes, Mango]

        // contains(Object o) - checks if an element exists
        System.out.println("Contains 'Apple'? " + set.contains("Apple")); // true

        // remove(Object o) - removes an element
        set.remove("Apple");
        System.out.println("After removing 'Apple': " + set);

        // size() - returns the number of elements
        System.out.println("Size: " + set.size());

        // isEmpty() - checks if the set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // clear() - removes all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}