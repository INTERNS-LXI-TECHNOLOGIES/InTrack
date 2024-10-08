import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Longest{
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("apple","orange","banana","cherry");

        String longe=fruits.stream().max((f1,f2) -> Integer.compare(f1.length(),f2.length())).orElse("no fruits available");

        System.out.println(longe);

        String lon=fruits.stream().max(Comparator.comparing(String::length)).orElse(null);

        System.out.println(lon);
    }
}