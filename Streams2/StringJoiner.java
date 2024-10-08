import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class StringJoiner{
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("apple","orange","banana","cherry");

        String fruits2=fruits.stream()
                             .collect(Collectors.joining(", "));
        System.out.println(fruits2);
    }
}