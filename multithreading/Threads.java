package multithreading;

// Multithreading allows multiple threads to run concurrently in a program.
// It is mainly used to perform multiple tasks simultaneously for better performance.

class MyThread extends Thread {
    // This class extends Thread and overrides run() to define task for the thread

    public void run() {
        // run() method is the entry point of a thread.
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyThread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms to simulate delay
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted.");
            }
        }
    }
}

// Creating thread by implementing Runnable interface
class MyRunnable implements Runnable {
    // Runnable is preferred when extending from another class is needed
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyRunnable: " + i);
            try {
                Thread.sleep(700); // Sleep for 700ms
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted.");
            }
        }
    }
}

class SharedResource {
    // A shared resource that needs synchronization
    synchronized void printCount() {
        // synchronized ensures that only one thread accesses this method at a time
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " Count: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

// For inter-thread communication using wait() and notify()
class InterThread {
    int data;
    boolean hasValue = false;

    synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // wait if data is already produced
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
        data = value;
        hasValue = true;
        System.out.println("Produced: " + data);
        notify(); // notify waiting consumer
    }

    synchronized void consume() {
        while (!hasValue) {
            try {
                wait(); // wait until data is produced
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
        System.out.println("Consumed: " + data);
        hasValue = false;
        notify(); // notify producer to produce next item
    }
}

public class Threads {

    public static void main(String[] args) {
        System.out.println("=== Thread Creation Using Thread Class ===");
        MyThread t1 = new MyThread(); // Create thread object
        t1.setName("Thread-One");
        t1.setPriority(Thread.MAX_PRIORITY); // Set high priority (1 to 10)
        t1.start(); // start() invokes run() in a new thread

        System.out.println("=== Thread Creation Using Runnable Interface ===");
        Thread t2 = new Thread(new MyRunnable(), "Runnable-Thread");
        t2.setPriority(Thread.MIN_PRIORITY); // Set low priority
        t2.start();

        // Thread Life Cycle (New, Runnable, Running, Blocked, Terminated)
        // start() -> thread becomes Runnable
        // JVM picks the thread -> Running
        // sleep(), wait(), I/O -> Blocked
        // run() ends -> Terminated

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
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                inter.consume();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("Consumer thread interrupted.");
                }
            }
        });

        producer.start();
        consumer.start();

        // Summary:
        // Thread can be created by extending Thread or implementing Runnable.
        // start() starts a new thread; run() just calls the method in current thread.
        // setPriority(int) affects thread scheduling (not guaranteed).
        // Synchronization prevents race conditions.
        // Inter-thread communication allows coordination using wait() and notify().
    }
}


/*
Concept	Description
Thread	A thread is a lightweight sub-process that runs concurrently with other threads.
Thread Life Cycle	New → Runnable → Running → Blocked/Waiting → Terminated
Creating Threads	Using extends Thread or implements Runnable
start() vs run()	start() creates a new thread and calls run() internally.
Thread Priorities	Range: MIN_PRIORITY (1), NORM_PRIORITY (5), MAX_PRIORITY (10)
Synchronization	Ensures that only one thread accesses critical section at a time.
wait() / notify()	Used for communication between threads to coordinate actions.
 */