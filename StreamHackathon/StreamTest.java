import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] CountWordsStartingWithD) {
        List<String> words = Arrays.asList("Dog", "Cat", "Deer", "Duck", "Elephant", "Dolphin");

        long count = words.stream()
                .filter(word -> word.startsWith("D"))
                .count();

        System.out.println("Number of words starting with 'D': " + count);
    }
}