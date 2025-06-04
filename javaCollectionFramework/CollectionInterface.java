package javaCollectionFramework;

// CollectionInterface.java
// This file demonstrates the Collection interface in Java.

import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        for (String fruit : collection) {
            System.out.println(fruit);
        }
    }
}
