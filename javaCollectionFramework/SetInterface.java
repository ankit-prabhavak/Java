package javaCollectionFramework;

// SetInterface.java
// This file demonstrates the Set interface in Java.

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");

        System.out.println("Set: " + set);
    }
}
