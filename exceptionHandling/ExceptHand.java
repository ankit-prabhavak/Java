package exceptionHandling;

// ===========================================================
// ✅ USER-DEFINED EXCEPTION CLASS
// ===========================================================

// User-defined exceptions are created by extending the Exception class.
// This is a Checked Exception because it extends Exception (not RuntimeException).
class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message); // Call parent constructor to store custom message
    }
}

// ===========================================================
// ✅ MAIN CLASS: ExceptHand
// ===========================================================
public class ExceptHand {

    // ===========================================================
    // ✅ What is an Exception?
    // ➤ An exception is an event that disrupts the normal flow of a program.
    // ➤ For example: dividing by zero, accessing an invalid index, etc.
    // ===========================================================

    // ===========================================================
    // ✅ EXCEPTIONS VS ERRORS
    // ➤ Exceptions: Recoverable conditions (e.g., FileNotFoundException)
    // ➤ Errors: Irrecoverable problems (e.g., StackOverflowError, OutOfMemoryError)
    // ===========================================================

    // ===========================================================
    // ✅ CHECKED EXCEPTION METHOD
    // ➤ Checked exceptions are checked at compile time.
    // ➤ Example: FileNotFoundException, IOException
    // ➤ Must be handled using try-catch or declared using 'throws'
    // ===========================================================
    public static void checkedExceptionDemo() throws java.io.FileNotFoundException {
        // This line will throw FileNotFoundException if the file doesn't exist
        java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
    }

    // ===========================================================
    // ✅ UNCHECKED EXCEPTION METHOD
    // ➤ Unchecked exceptions are not checked at compile time.
    // ➤ Example: ArithmeticException, NullPointerException
    // ===========================================================
    public static void uncheckedExceptionDemo() {
        // Division by zero causes ArithmeticException
        int result = 10 / 0;
    }

    // ===========================================================
    // ✅ USER-DEFINED EXCEPTION METHOD
    // ➤ 'throw' is used to manually throw an exception object.
    // ➤ 'throws' is used to declare possible exceptions in method signature.
    // ===========================================================
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            // Throwing a user-defined checked exception
            throw new AgeValidationException("❌ Age must be 18 or above.");
        } else {
            System.out.println("✅ Age is valid. Access granted.");
        }
    }

    // ===========================================================
    // ✅ MAIN METHOD - Program Entry Point
    // ===========================================================
    public static void main(String[] args) {

        System.out.println("=== 📘 Java Exception Handling Demo ===\n");

        // ===========================================================
        // ✅ CONTROL FLOW IN EXCEPTION HANDLING
        // ➤ try: contains code that may cause exception
        // ➤ catch: handles the exception
        // ➤ finally: always executes (used for clean-up code)
        // ===========================================================
        try {
            System.out.println("🔎 Trying to access invalid array index...");
            int[] arr = new int[3];
            arr[5] = 100; // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❗ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("✅ Finally block executed. (Always runs)");
        }

        // ===========================================================
        // ✅ JVM REACTION TO UNCAUGHT EXCEPTIONS
        // ➤ If exception is not caught, JVM terminates the program and prints error.
        // ➤ Here we catch it to prevent crash.
        // ===========================================================
        try {
            System.out.println("\n🔎 Performing division by zero...");
            uncheckedExceptionDemo();
        } catch (ArithmeticException e) {
            System.out.println("❗ Caught ArithmeticException: " + e.getMessage());
        }

        // ===========================================================
        // ✅ HANDLING CHECKED EXCEPTION
        // ➤ FileNotFoundException must be handled or declared using 'throws'
        // ===========================================================
        try {
            System.out.println("\n🔎 Attempting to read a non-existent file...");
            checkedExceptionDemo();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("❗ Caught Checked Exception: " + e.getMessage());
        }

        // ===========================================================
        // ✅ USER-DEFINED EXCEPTION DEMO
        // ➤ Demonstrates throw and throws
        // ===========================================================
        try {
            System.out.println("\n🔎 Validating age for voting...");
            validateAge(16); // Age is less than 18
        } catch (AgeValidationException e) {
            System.out.println("❗ Caught Custom Exception: " + e.getMessage());
        }

        // ===========================================================
        // ✅ PROGRAM CONTINUES AFTER EXCEPTIONS ARE HANDLED
        // ===========================================================
        System.out.println("\n✅ Program continues after exception handling.");
    }
}


/*
 Topic	Summary
Exception	Unwanted event that disrupts program flow.
Error	Serious problems not meant to be caught (e.g., OutOfMemoryError).
Checked Exception	Handled at compile-time (IOException, SQLException). Must use try-catch or throws.
Unchecked Exception	Occurs at runtime (ArithmeticException, NullPointerException). Optional to catch.
try	Wraps risky code.
catch	Handles the exception.
finally	Always executes. Useful for closing resources.
throw	Used to manually throw an exception object.
throws	Used to declare that a method might throw an exception.
User-defined Exception	Extend Exception or RuntimeException to create custom rules.
 */


 /*
Here are more examples of checked exceptions, unchecked exceptions, and errors in Java:

Checked Exceptions (must be handled or declared)
IOException
FileNotFoundException
SQLException
ClassNotFoundException
InterruptedException
ParseException
NoSuchMethodException
InstantiationException
IllegalAccessException
InvocationTargetException

Unchecked Exceptions (Runtime Exceptions, optional to handle)
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
NumberFormatException
IllegalArgumentException
IllegalStateException
ClassCastException
IndexOutOfBoundsException
NegativeArraySizeException
UnsupportedOperationException
StringIndexOutOfBoundsException

Errors (serious problems, not meant to be caught)
StackOverflowError
OutOfMemoryError
VirtualMachineError
NoClassDefFoundError
AssertionError
ExceptionInInitializerError
LinkageError
InternalError

  */