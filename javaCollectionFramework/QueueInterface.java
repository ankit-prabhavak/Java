package javaCollectionFramework;

// QueueInterface.java
// This file demonstrates the Queue interface in Java.

import java.util.*;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");

        System.out.println("Queue: " + queue);
    }
}
