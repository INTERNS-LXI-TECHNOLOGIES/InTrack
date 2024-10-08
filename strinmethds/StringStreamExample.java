
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamExample {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList(" Hello ", "world", "  Java  ", "stream", "API ", "", "123", "Java Stream API");

        // 1. Trimming whitespace from each string
        List<String> trimmedStrings = strings.stream()
                                             .map(String::trim)
                                             .collect(Collectors.toList());
        System.out.println("Trimmed Strings: " + trimmedStrings);

        // 2. Converting all strings to uppercase
        List<String> upperCaseStrings = trimmedStrings.stream()
                                                      .map(String::toUpperCase)
                                                      .collect(Collectors.toList());
        System.out.println("Uppercase Strings: " + upperCaseStrings);

        // 3. Filtering strings that contain 'A'
        List<String> containsA = upperCaseStrings.stream()
                                                  .filter(s -> s.contains("A"))
                                                  .collect(Collectors.toList());
        System.out.println("Strings containing 'A': " + containsA);

        // 4. Getting the length of each string
        List<Integer> lengths = trimmedStrings.stream()
                                               .map(String::length)
                                               .collect(Collectors.toList());
        System.out.println("Lengths of Strings: " + lengths);

        // 5. Replacing 'A' with '@'
        List<String> replacedAWithAt = upperCaseStrings.stream()
                                                        .map(s -> s.replace('A', '@'))
                                                        .collect(Collectors.toList());
        System.out.println("Replaced 'A' with '@': " + replacedAWithAt);

        // 6. Getting the first character of each string
        // 6. Getting the first character of each string, with default for empty strings
List<Character> firstChars = trimmedStrings.stream()
.map(s -> s.isEmpty() ? ' ' : s.charAt(0)) // Use a default character for empty strings
.collect(Collectors.toList());

        System.out.println("First characters: " + firstChars);


        /*or

        // 6. Getting the first character of each string
// 6. Getting the first character of each non-empty string
List<Character> firstChars = trimmedStrings.stream()
                                            .filter(s -> !s.isEmpty()) // Filter out empty strings
                                            .map(s -> s.charAt(0))
                                            .collect(Collectors.toList());/* */




        // 7. Joining all strings with a comma
        String joinedString = trimmedStrings.stream()
                                             .collect(Collectors.joining(", "));
        System.out.println("Joined String: " + joinedString);

        // 8. Counting non-empty strings
        long nonEmptyCount = trimmedStrings.stream()
                                            .filter(s -> !s.isEmpty())
                                            .count();
        System.out.println("Count of non-empty strings: " + nonEmptyCount);

        // 9. Finding the first string that starts with 'J'
        String firstStartsWithJ = trimmedStrings.stream()
                                                 .filter(s -> s.startsWith("J"))
                                                 .findFirst()
                                                 .orElse("No string starts with J");
        System.out.println("First string starting with 'J': " + firstStartsWithJ);

        // 10. Finding the longest string
        String longestString = trimmedStrings.stream()
                                             .reduce("", (s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println("Longest String: " + longestString);
    }
}
