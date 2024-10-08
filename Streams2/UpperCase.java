import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class UpperCase{
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("apple","orange","banana","cherry");

        List<String> fruit=fruits.stream()
                         .map(f -> f.toUpperCase())
                         .collect(Collectors.toList());

        System.out.println(fruit);
    }
}