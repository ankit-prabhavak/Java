package javaCollectionFramework;

// ComparatorInterfaceExample.java
// This file demonstrates the Comparator interface in Java.

import java.util.*;

public class ComparatorInterfaceExample {
    private String name;

    public ComparatorInterfaceExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<ComparatorInterfaceExample> list = new ArrayList<>();
        list.add(new ComparatorInterfaceExample("Banana"));
        list.add(new ComparatorInterfaceExample("Apple"));

        list.sort(Comparator.comparing(ComparatorInterfaceExample::getName));

        for (ComparatorInterfaceExample item : list) {
            System.out.println(item.getName());
        }
    }
}
