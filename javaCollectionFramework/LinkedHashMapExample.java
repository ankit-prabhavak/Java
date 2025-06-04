package javaCollectionFramework;

// LinkedHashMapExample.java
// This file demonstrates the usage of LinkedHashMap in Java.

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");

        System.out.println("LinkedHashMap: " + map);
    }
}
