package javaCollectionFramework;

// StackExample.java
// This file demonstrates the usage of Stack in Java.

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");

        System.out.println("Stack: " + stack);
    }
}
