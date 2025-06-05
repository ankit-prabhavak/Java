package javaCollectionFramework;

// HashtableExample.java
// This file demonstrates the usage of Hashtable in Java with common methods and examples.

import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");
        hashtable.put("C", "Cherry");
        hashtable.put("D", "Date");

        // Printing the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // get(Object key) - Get value for a key
        System.out.println("Value for key 'B': " + hashtable.get("B"));

        // containsKey(Object key) - Check if a key exists
        System.out.println("Contains key 'C'? " + hashtable.containsKey("C"));

        // containsValue(Object value) - Check if a value exists
        System.out.println("Contains value 'Date'? " + hashtable.containsValue("Date"));

        // remove(Object key) - Remove a key-value pair
        hashtable.remove("A");
        System.out.println("After removing key 'A': " + hashtable);

        // size() - Number of key-value pairs
        System.out.println("Size: " + hashtable.size());

        // isEmpty() - Check if hashtable is empty
        System.out.println("Is hashtable empty? " + hashtable.isEmpty());

        // Iterating over keys
        System.out.println("Keys:");
        for (String key : hashtable.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("Values:");
        for (String value : hashtable.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // clear() - Remove all entries
        hashtable.clear();
        System.out.println("After clear: " + hashtable);
    }
}