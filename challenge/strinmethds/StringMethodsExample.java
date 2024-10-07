public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        // 1. Length
        System.out.println("Length: " + str.length()); // Length: 15

        // 2. charAt
        System.out.println("Character at index 1: " + str.charAt(0)); // Character at index 1: 'H'

        // 3. substring
        System.out.println("Substring (7, 12): " + str.substring(7, 12)); // Substring (7, 12):  , Wor"

        // 4. indexOf
        System.out.println("Index of 'o': " + str.indexOf('o')); // Index of 'o': 4

        // 5. lastIndexOf
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Last index of 'o': 8

        // 6. toLowerCase
        System.out.println("Lowercase: " + str.toLowerCase()); // Lowercase: "  hello, world!  "

        // 7. toUpperCase
        System.out.println("Uppercase: " + str.toUpperCase()); // Uppercase: "  HELLO, WORLD!  "

        // 8. trim
        System.out.println("Trimmed: '" + str.trim() + "'"); // Trimmed: 'Hello, World!'

        // 9. replace
        System.out.println("Replaced 'World' with 'Java': " + str.replace("World", "Java")); // Replaced 'World' with 'Java': "  Hello, Java!  "

        // 10. split
        String[] words = str.split(", ");
        System.out.println("Split by ', ': ");
        for (String word : words) {
            System.out.println(word); // Outputs each word on a new line
        }

        // 11. contains
        System.out.println("Contains 'Hello': " + str.contains("Hello")); // Contains 'Hello': true

        // 12. startsWith
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello")); // Starts with '  Hello': true

        // 13. endsWith
        System.out.println("Ends with '!  ': " + str.endsWith("!  ")); // Ends with '!  ': true

        // 14. valueOf
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("Value of integer 123 as string: " + numberStr); // Value of integer 123 as string: 123

        // 15. format
        String formatted = String.format("Hello, %s!", "Alice");
        System.out.println("Formatted String: " + formatted); // Formatted String: Hello, Alice!

        // 16. compareTo
        int comparison = "abc".compareTo("abd");
        System.out.println("Comparison of 'abc' and 'abd': " + comparison); // Comparison of 'abc' and 'abd': -1

        // 17. isEmpty
        System.out.println("Is the string empty? " + str.isEmpty()); // Is the string empty? false
    }
}
