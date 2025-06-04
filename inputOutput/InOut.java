package inputOutput;

import java.io.*;

// Input/Output Basics in Java
public class InOut {

    public static void main(String[] args) {
        // File paths (change as per your system if needed)
        String byteFilePath = "byteData.txt";
        String charFilePath = "charData.txt";

        // Demonstrating Byte Stream
        writeUsingByteStream(byteFilePath);
        readUsingByteStream(byteFilePath);

        // Demonstrating Character Stream
        writeUsingCharStream(charFilePath);
        readUsingCharStream(charFilePath);
    }

    // ================= BYTE STREAM ====================
    /*
     * Byte Stream handles raw binary data (image, audio, text files etc.)
     * It uses classes from java.io package like FileInputStream and FileOutputStream
     * Ideal for binary files and low-level data handling
     */
    public static void writeUsingByteStream(String filePath) {
        try {
            // FileOutputStream writes byte data to a file
            FileOutputStream fos = new FileOutputStream(filePath);
            String data = "This is written using Byte Stream.\n";
            byte[] byteData = data.getBytes();  // Convert string to byte array
            fos.write(byteData);                // Write bytes to file
            fos.close();
            System.out.println("Byte Stream: Data written successfully.");
        } catch (IOException e) {
            System.out.println("Byte Stream Write Error: " + e.getMessage());
        }
    }

    public static void readUsingByteStream(String filePath) {
        try {
            // FileInputStream reads byte data from a file
            FileInputStream fis = new FileInputStream(filePath);
            int i;
            System.out.print("Byte Stream Read: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);  // convert byte to character
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Byte Stream Read Error: " + e.getMessage());
        }
        System.out.println();
    }

    // =============== CHARACTER STREAM ==================
    /*
     * Character Stream handles character data (text files)
     * It uses classes like FileReader and FileWriter
     * Ideal for reading/writing characters, arrays, or strings
     */
    public static void writeUsingCharStream(String filePath) {
        try {
            // FileWriter writes character data to file
            FileWriter fw = new FileWriter(filePath);
            fw.write("This is written using Character Stream.\n");
            fw.close();
            System.out.println("Character Stream: Data written successfully.");
        } catch (IOException e) {
            System.out.println("Character Stream Write Error: " + e.getMessage());
        }
    }

    public static void readUsingCharStream(String filePath) {
        try {
            // FileReader reads character data from file
            FileReader fr = new FileReader(filePath);
            int i;
            System.out.print("Character Stream Read: ");
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);  // reading character by character
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Character Stream Read Error: " + e.getMessage());
        }
        System.out.println();
    }
}

/*
Topic	Description
Byte Streams	Used to read/write raw bytes. Classes: FileInputStream, FileOutputStream. Best for binary files.
Character Streams	Used to read/write characters. Classes: FileReader, FileWriter. Best for text files.
FileInputStream	Reads byte data from a file one byte at a time.
FileOutputStream	Writes byte data to a file using byte arrays.
FileReader	Reads character data from file, one character at a time.
FileWriter	Writes characters, arrays, or strings to a file.
IOExceptions	Always handle file operations with try-catch for safety and debugging.
*/
