package javaCollectionFramework;

// HashtableExample.java
// This file demonstrates the usage of Hashtable in Java.

import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");

        System.out.println("Hashtable: " + hashtable);
    }
}
