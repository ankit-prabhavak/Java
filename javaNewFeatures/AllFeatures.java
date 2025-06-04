package javaNewFeatures;

import java.io.*;
import java.util.*;
import java.util.Base64;
import java.util.stream.*;
import java.lang.annotation.*;

public class AllFeatures {

    // ============================================
    // 1. Functional Interfaces
    // A Functional Interface is an interface that has exactly one abstract method.
    // This interface can have multiple default or static methods, but only one abstract method.
    // Functional Interfaces are meant to represent single-function operations, and they are primarily used in lambda expressions.
    // The @FunctionalInterface annotation is optional but adds clarity and ensures the interface adheres to the functional interface rules.
    
    @FunctionalInterface
    interface MyFunctionalInterface {
        void display(); // Single abstract method
        
        // Default method implementation - can be used in all classes that implement this interface
        default void defaultMethod() {
            System.out.println("Default Method in Functional Interface");
        }
    }

    // Example: Creating a lambda expression that implements the display method
    static MyFunctionalInterface lambdaDemo = () -> System.out.println("Lambda Expression Executed");

    // ============================================
    // 2. Lambda Expressions
    // A lambda expression allows you to express instances of single-method interfaces (functional interfaces) in a clear and concise way.
    // Syntax: (parameters) -> expression or { statements }
    // In our case, we use a lambda expression to implement the display method of MyFunctionalInterface.
    // Lambda expressions provide a more functional approach and are often used with collections and stream API.
    // For example, the lambda expression "()->System.out.println('Lambda Expression Executed')" implements the abstract method of the interface.

    // ============================================
    // 3. Method References
    // Method references provide a way to refer to a method of a class or an object directly by its name.
    // Syntax: ClassName::methodName or object::methodName.
    // It simplifies the syntax, especially when a lambda expression is just calling a method.
    // Method references are often used in conjunction with streams or lambda expressions.
    
    static void greet() {
        System.out.println("Hello from method reference");
    }
    static MyFunctionalInterface ref = AllFeatures::greet;  // Referring to the static greet method using a method reference
    
    // Example: AllFeatures::greet refers to the greet() method in this class, which is then executed when ref is called.

    // ============================================
    // 4. Stream API
    // The Stream API, introduced in Java 8, allows functional-style operations on sequences of elements (e.g., Collections).
    // Operations like filter, map, and reduce allow you to work with collections in a declarative way.
    // The Stream API allows parallel processing, eliminating the need for explicit loops.
    static void streamDemo() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()  // Create a stream from the list
             .filter(n -> n.startsWith("A"))  // Filter names starting with 'A'
             .forEach(System.out::println);  // Print each name
    }

    // ============================================
    // 5. Default Methods in Interfaces
    // Default methods allow interfaces to have method implementations, avoiding the need for breaking existing code.
    // This allows you to add new methods to interfaces without requiring modifications in the implementing classes.
    interface DefaultDemo {
        // Default method implementation
        default void show() {
            System.out.println("Default method in interface");
        }
    }

    // ============================================
    // 6. Static Methods in Interfaces
    // Static methods can now be defined in interfaces as of Java 8.
    // These methods are not inherited by the implementing classes and must be called using the interface name.
    interface StaticMethodDemo {
        static void staticShow() {
            System.out.println("Static method in interface");
        }
    }

    // ============================================
    // 7. Base64 Encoding and Decoding
    // Base64 encoding converts binary data (e.g., files) to ASCII characters for transmission over text-based protocols (e.g., email).
    // The Base64 class in Java provides methods to encode and decode data using the Base64 scheme.
    static void base64Demo() {
        String original = "HelloJava";
        // Encoding the string to Base64
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        // Decoding the Base64 encoded string back to the original
        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }

    // ============================================
    // 8. forEach Method
    // The forEach() method provides a convenient way to iterate over collections and execute an action on each element.
    // It's often used in conjunction with lambda expressions or method references.
    static void forEachDemo() {
        List<String> names = Arrays.asList("Ankit", "Rahul", "Neha");
        // Using method reference to print each name
        names.forEach(System.out::println); 
    }

    // ============================================
    // 9. Try-with-Resources
    // Try-with-resources is a feature introduced in Java 7 that ensures resources like files or streams are automatically closed.
    // Resources are declared in the try statement and closed automatically at the end of the block, even if an exception occurs.
    static void tryWithResourcesDemo() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            // Reading from file
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ============================================
    // 10. Type Annotations
    // Type annotations allow annotations to be applied to the types used in the program, enhancing compile-time checks.
    // This feature is used to mark types with additional metadata, which can then be validated by tools like IDEs or compilers.
    @Target({ElementType.TYPE_USE}) // Annotation applies to types used in declarations.
    @interface NonNull {}
    static List<@NonNull String> safeList = new ArrayList<>(); // The NonNull annotation ensures that this list cannot contain null values

    // ============================================
    // 11. Repeating Annotations
    // Repeating annotations allow the same annotation to be applied multiple times to the same element.
    // This feature eliminates the need to create a container annotation to hold multiple annotations.
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Hints.class)
    @interface Hint {
        String value();
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hints {
        Hint[] value();
    }

    @Hint("hint1")
    @Hint("hint2")
    class Person {}

    // ============================================
    // 12. Java Module System (Java 9)
    // The Java Module System allows developers to break down a large project into smaller, reusable modules.
    // Modules declare their dependencies and exported packages in a module-info.java file.
    // This modular approach helps improve security, performance, and maintainability.
    // Example of module-info.java:
    // module my.module.name {
    //     requires java.base;
    //     exports my.package;
    // }
    
    // ============================================
    // 13. Diamond Syntax with Anonymous Class
    // Java's diamond operator <> can be used with anonymous classes to infer the type of the class being instantiated.
    // This reduces redundancy and simplifies the code, as you don't have to repeat the type.
    abstract static class Demo {
        abstract void show();
    }
    static Demo d = new Demo() {
        @Override
        void show() {
            System.out.println("Anonymous class using diamond operator");
        }
    };

    // ============================================
    // 14. Local Variable Type Inference (var)
    // In Java 10 and later, the `var` keyword allows the compiler to infer the type of a local variable.
    // This simplifies code, especially when the type is obvious from the right-hand side.
    static void varDemo() {
        var num = 100; // Compiler infers num as int
        var list = List.of("Java", "Python"); // Compiler infers list as List<String>
        System.out.println("Number: " + num);
        list.forEach(System.out::println);
    }

    // ============================================
    // 15. Switch Expressions (Java 12)
    // Switch expressions provide a more concise and flexible way to write switch statements.
    // It allows returning values from switch cases and supports the "arrow" syntax (case -> result).
    static void switchExpressionDemo() {
        int day = 2;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Other Day";
        };
        System.out.println("Switch Expression: " + result);
    }

    // ============================================
    // 16. Yield Keyword (Java 13)
    // The yield keyword is used within a switch expression to return a value from a block.
    // This enhances the clarity and flexibility of multi-line switch cases.
    static void yieldDemo() {
        int day = 1;
        String msg = switch (day) {
            case 1 -> {
                yield "It's Monday!";
            }
            case 2 -> {
                yield "It's Tuesday!";
            }
            default -> "Unknown day";
        };
        System.out.println("Yielded Value: " + msg);
    }

    // ============================================
    // 17. Text Blocks (Java 13)
    // Text blocks are multi-line string literals that preserve the format of the text, making it easier to work with large text (JSON, SQL, etc.).
    static void textBlockDemo() {
        String json = """
            {
                "name": "Ankit",
                "course": "BTech CSE"
            }
            """;
        System.out.println(json);
    }

    // ============================================
    // 18. Records (Java 16)
    // Records are a special kind of class introduced in Java 16, designed to hold data.
    // Records automatically generate a constructor, getters, equals(), hashCode(), and toString() methods.
    record Student(String name, int age) {}

    static void recordDemo() {
        Student s = new Student("Ankit", 20);
        System.out.println("Record: " + s.name() + ", Age: " + s.age());
    }

    // ============================================
    // 19. Sealed Classes (Java 17)
    // Sealed classes allow you to control which other classes or interfaces can extend or implement them.
    // Sealed classes help in controlling inheritance in a more predictable and secure way.
    sealed static class Vehicle permits Car, Bike {}
    static final class Car extends Vehicle {}
    static final class Bike extends Vehicle {}

    public static void main(String[] args) {
        lambdaDemo.display();
        ref.display();
        streamDemo();
        base64Demo();
        forEachDemo();
        tryWithResourcesDemo();
        varDemo();
        switchExpressionDemo();
        yieldDemo();
        textBlockDemo();
        recordDemo();
        d.show();
        StaticMethodDemo.staticShow();
    }
}