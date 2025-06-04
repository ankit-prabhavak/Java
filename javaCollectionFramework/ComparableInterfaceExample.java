package javaCollectionFramework;

// ComparableInterfaceExample.java
// This file demonstrates the Comparable interface in Java.

import java.util.*;

public class ComparableInterfaceExample implements Comparable<ComparableInterfaceExample> {
    private String name;

    public ComparableInterfaceExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ComparableInterfaceExample o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        List<ComparableInterfaceExample> list = new ArrayList<>();
        list.add(new ComparableInterfaceExample("Banana"));
        list.add(new ComparableInterfaceExample("Apple"));

        Collections.sort(list);
        for (ComparableInterfaceExample item : list) {
            System.out.println(item.getName());
        }
    }
}
