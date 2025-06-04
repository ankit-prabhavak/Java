package javaCollectionFramework;

// MapInterface.java
// This file demonstrates the Map interface in Java.

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");

        System.out.println("Map: " + map);
    }
}
