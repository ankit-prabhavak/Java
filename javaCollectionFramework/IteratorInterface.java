package javaCollectionFramework;

// IteratorInterface.java
// This file demonstrates the Iterator interface in Java.

import java.util.*;

public class IteratorInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
