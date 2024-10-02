import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] filterEmptyStrings) {
        List<String> strings = Arrays.asList("apple", "", "banana", " ", "cherry", "", "date");

        List<String> filteredStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered strings: " + filteredStrings);
    }
}