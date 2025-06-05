package multithreading;

/**
 * Multithreading in Java: Concepts, Implementation, Advantages, and Disadvantages
 * ------------------------------------------------------------------------------
 * Multithreading allows multiple threads to run concurrently, enabling efficient CPU utilization,
 * faster program execution, and responsive applications. Each thread is a lightweight sub-process
 * sharing the same memory space but running independently.
 *
 * Key Concepts:
 * - Thread: A unit of execution within a process.
 * - Thread Life Cycle: The various states a thread can be in during its lifetime.
 * - Creating Threads: By extending Thread or implementing Runnable.
 * - Thread Priorities: Influence thread scheduling (not guaranteed by JVM).
 * - Synchronization: Prevents race conditions by allowing only one thread in a critical section.
 * - Inter-thread Communication: Coordination between threads using wait(), notify(), notifyAll().
 *
 * Advantages:
 * - Better CPU utilization.
 * - Faster program execution for independent tasks.
 * - Improved application responsiveness (e.g., UI apps).
 * - Simplifies modeling of real-world concurrent activities.
 *
 * Disadvantages:
 * - Increased complexity (harder to debug and maintain).
 * - Risk of race conditions and deadlocks if not handled properly.
 * - Context switching overhead.
 * - Unpredictable thread scheduling (platform/JVM dependent).
 */

class MyThread extends Thread {
    // Extending Thread class to create a custom thread.
    // Use this method if you don't need to extend another class.
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " (MyThread) Count: " + i);
            try {
                Thread.sleep(500); // Simulate work and allow context switching
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

class MyRunnable implements Runnable {
    // Implementing Runnable interface (preferred if you need to extend another class).
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (MyRunnable) Count: " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

class SharedResource {
    // Shared resource demonstrating synchronization.
    synchronized void printCount() {
        // Only one thread can execute this method at a time.
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " (Sync) Count: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

class InterThread {
    // Demonstrates inter-thread communication using wait() and notify().
    int data;
    boolean hasValue = false;

    synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // Wait until value is consumed
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
        data = value;
        hasValue = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer
    }

    synchronized void consume() {
        while (!hasValue) {
            try {
                wait(); // Wait until value is produced
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
        System.out.println("Consumed: " + data);
        hasValue = false;
        notify(); // Notify producer
    }
}

public class Threads {

    public static void main(String[] args) {
        System.out.println("=== Thread Creation Using Thread Class ===");
        MyThread t1 = new MyThread();
        t1.setName("Thread-One");
        t1.setPriority(Thread.MAX_PRIORITY); // Priority: 10 (highest)
        t1.start(); // start() creates a new thread and calls run() internally

        System.out.println("=== Thread Creation Using Runnable Interface ===");
        Thread t2 = new Thread(new MyRunnable(), "Runnable-Thread");
        t2.setPriority(Thread.MIN_PRIORITY); // Priority: 1 (lowest)
        t2.start();

        // Thread Life Cycle:
        // New -> Runnable (after start()) -> Running (when scheduled by JVM)
        // -> Blocked/Waiting (sleep(), wait(), I/O) -> Terminated (run() ends)

        System.out.println("=== Synchronization Example ===");
        SharedResource shared = new SharedResource();
        Thread sync1 = new Thread(() -> shared.printCount(), "SyncThread-1");
        Thread sync2 = new Thread(() -> shared.printCount(), "SyncThread-2");
        sync1.start();
        sync2.start();

        System.out.println("=== Inter-thread Communication Example ===");
        InterThread inter = new InterThread();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                inter.produce(i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Producer thread interrupted.");
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                inter.consume();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Consumer thread interrupted.");
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();

        // Summary of Concepts:
        // - Thread can be created by extending Thread or implementing Runnable.
        // - start() creates a new thread; run() only runs in the current thread.
        // - setPriority(int) can hint scheduling, but is not guaranteed.
        // - Synchronization (synchronized keyword) prevents race conditions.
        // - Inter-thread communication (wait/notify) allows coordination.
    }
}

/*
==================== Multithreading Concepts ====================

Concept                | Description
-----------------------|----------------------------------------------------------
Thread                 | A lightweight sub-process running concurrently.
Thread Life Cycle      | New → Runnable → Running → Blocked/Waiting → Terminated
Creating Threads       | By extending Thread or implementing Runnable interface.
start() vs run()       | start() creates a new thread and calls run(); run() alone runs in current thread.
Thread Priorities      | MIN_PRIORITY (1), NORM_PRIORITY (5), MAX_PRIORITY (10)
Synchronization        | Ensures only one thread accesses a critical section at a time.
wait() / notify()      | Used for communication and coordination between threads.

==================== Advantages of Multithreading ===============
- Efficient CPU utilization.
- Faster execution for independent tasks.
- Improved responsiveness (especially in GUIs).
- Simplifies modeling of concurrent activities.

==================== Disadvantages of Multithreading ============
- Increased program complexity.
- Risk of race conditions and deadlocks.
- Harder to debug and maintain.
- Overhead due to context switching.
- Unpredictable scheduling (platform/JVM dependent).

==================== How Multithreading Works ===================
- JVM manages thread scheduling and context switching.
- Threads share the same memory space but have their own call stack.
- Synchronization is needed for shared resources to avoid data inconsistency.
- Inter-thread communication (wait/notify) is used for coordination.

*/