package inputOutput;

import java.io.*;

/**
 * Input/Output (I/O) Basics in Java
 * ---------------------------------
 * Java provides two main types of streams for file I/O:
 * 1. Byte Streams: For handling raw binary data (images, audio, etc.)
 * 2. Character Streams: For handling character data (text files)
 *
 * This class demonstrates both types with definitions, comments, and examples.
 */
public class InOut {

    public static void main(String[] args) {
        // File paths (change as per your system if needed)
        String byteFilePath = "byteData.txt";
        String charFilePath = "charData.txt";

        // Demonstrating Byte Stream (for binary or text data)
        writeUsingByteStream(byteFilePath);
        readUsingByteStream(byteFilePath);

        // Demonstrating Character Stream (for text data)
        writeUsingCharStream(charFilePath);
        readUsingCharStream(charFilePath);
    }

    // ================= BYTE STREAM ====================
    /*
     * Byte Streams handle raw binary data (such as images, audio, or any file).
     * They use classes from java.io package like FileInputStream and FileOutputStream.
     * Byte streams are best for binary files and low-level data handling.
     * Each byte is read/written as an 8-bit value.
     */

    /**
     * Writes data to a file using FileOutputStream (Byte Stream).
     * @param filePath Path to the file where data will be written.
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

    /**
     * Reads data from a file using FileInputStream (Byte Stream).
     * @param filePath Path to the file to be read.
     */
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
     * Character Streams handle character data (text files).
     * They use classes like FileReader and FileWriter.
     * Character streams are best for reading/writing characters, arrays, or strings.
     * Each character is read/written as a 16-bit Unicode value.
     */

    /**
     * Writes data to a file using FileWriter (Character Stream).
     * @param filePath Path to the file where data will be written.
     */
    public static void writeUsingCharStream(String filePath) {
        try {
            // FileWriter writes character data to file
            FileWriter fw = new FileWriter(filePath);
            fw.write("This is written using Character Stream.\n");
            fw.write("Character streams are best for text files.\n");
            fw.close();
            System.out.println("Character Stream: Data written successfully.");
        } catch (IOException e) {
            System.out.println("Character Stream Write Error: " + e.getMessage());
        }
    }

    /**
     * Reads data from a file using FileReader (Character Stream).
     * @param filePath Path to the file to be read.
     */
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
==================== SUMMARY TABLE ====================================================

| Stream Type      | Classes Used                | Best For           | Data Unit     |
|------------------|-----------------------------|--------------------|---------------|
| Byte Stream      | FileInputStream,            | Binary files,      | 8-bit bytes   |
|                  | FileOutputStream            | images, audio      |               |
| Character Stream | FileReader, FileWriter      | Text files         | 16-bit chars  |

==================== KEY POINTS =======================================================

- Byte Streams: Use for any file type, especially binary. Reads/writes bytes.
- Character Streams: Use for text files. Reads/writes characters.
- Always handle file I/O with try-catch for safety.
- Streams must be closed after use to free resources.
- FileInputStream/FileOutputStream: Read/write bytes.
- FileReader/FileWriter: Read/write characters.

*/