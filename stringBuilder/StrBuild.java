package stringBuilder;

public class StrBuild {
    public static void main(String[] args) {
        // 1. Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 2. Appending text to the end
        sb.append(" World");
        System.out.println("After append: " + sb); // Hello World

        // 3. Inserting text at a specific position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb); // Hello, World

        // 4. Replacing a portion of the string
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb); // Hi, World

        // 5. Deleting a portion of the string
        sb.delete(2, 3);
        System.out.println("After delete: " + sb); // Hi World

        // 6. Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW iH

        // 7. Getting the length of the string
        System.out.println("Length: " + sb.length());

        // 8. Getting a character at a specific index
        System.out.println("Char at index 2: " + sb.charAt(2));

        // 9. Setting a character at a specific index
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. Converting StringBuilder to String
        String str = sb.toString();
        System.out.println("As String: " + str);
    }
}