import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] findtheLongestWord) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon", "grape");

        String longestWord = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse("");

        System.out.println("Longest word: " + longestWord);
    }
}